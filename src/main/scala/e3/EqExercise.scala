package e3

/**
  * Created by Dennis on 27/05/2017.
  */
object EqExercise extends App {

  final case class Cat(name: String, age: Int, color: String)

  val cat1 = Cat("Garfield", 35, "orange and black")
  val cat2 = Cat("Heathcliff", 30, "orange and black")
  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  import EqInstances.catEq
  import cats.instances.option.catsKernelStdEqForOption
  import cats.syntax.eq.catsSyntaxEq

  println(cat1 === cat2)
  println(cat1 =!= cat2)

  println(optionCat1 === optionCat2)
  println(optionCat1 =!= optionCat2)
}
