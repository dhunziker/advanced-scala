package e02_cats_show

import e01_printable_type_class.Dog

object ShowInstances {

  import cats.Show
  import cats.instances.int.catsStdShowForInt
  import cats.instances.string.catsStdShowForString
  import cats.syntax.show.toShowOps

  implicit val dogShow = Show.show[Dog] { dog =>
    val name = dog.name.show
    val age = dog.age.show
    val color = dog.color.show
    s"$name is a $age year-old $color dog."
  }
}
