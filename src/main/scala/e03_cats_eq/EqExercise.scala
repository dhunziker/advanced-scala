package e03_cats_eq

object EqExercise extends App {
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
