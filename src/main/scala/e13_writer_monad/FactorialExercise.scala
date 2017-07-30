package e13_writer_monad

object FactorialExercise extends App {

  import cats.data.Writer
  import cats.instances.vector._
  import cats.syntax.applicative._

  type Logged[A] = Writer[Vector[String], A]

  def slowly[A](body: => A) = try body finally Thread.sleep(100)

  def factorial(n: Int): Logged[Int] = {
    val ans = slowly(if (n == 0) 1.pure[Logged] else factorial(n - 1).map(_ * n))
    ans.tell(Vector(s"fact $n ${ans.value}"))
  }

  import scala.concurrent.ExecutionContext.Implicits.global
  import scala.concurrent._
  import scala.concurrent.duration._

  val Vector(a, b) = Await.result(Future.sequence(Vector(
    Future(factorial(5).run),
    Future(factorial(5).run)
  )), 5.seconds)
  println(a)
  println(b)
}
