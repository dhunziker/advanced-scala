package e2

/**
  * Created by Dennis on 27/05/2017.
  */
object ShowExercise extends App {

  import ShowInstances.dogShow
  import cats.syntax.show.toShowOps
  import e1.Dog

  val dog = Dog("Billy", 4, "orange")
  println(dog.show)

}
