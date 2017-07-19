package e2

/**
  * Created by Dennis on 27/05/2017.
  */
object ShowInstances {

  import cats.Show
  import cats.instances.int.catsStdShowForInt
  import cats.instances.string.catsStdShowForString
  import cats.syntax.show.toShowOps
  import e1.Dog

  implicit val dogShow = Show.show[Dog] { dog =>
    val name = dog.name.show
    val age = dog.age.show
    val color = dog.color.show
    s"$name is a $age year-old $color dog."
  }

}
