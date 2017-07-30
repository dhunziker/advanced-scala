package e02_cats_show

import e01_printable_type_class.Dog

object ShowExercise extends App {

  import ShowInstances.dogShow
  import cats.syntax.show.toShowOps

  val dog = Dog("Billy", 4, "orange")
  println(dog.show)
}
