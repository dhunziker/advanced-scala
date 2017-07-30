package e03_cats_eq

object EqInstances {

  import cats.Eq
  import cats.instances.int.catsKernelStdOrderForInt
  import cats.instances.string.catsKernelStdOrderForString
  import cats.syntax.eq.catsSyntaxEq

  implicit val catEq = Eq.instance[Cat]((cat1, cat2) => {
    (cat1.name === cat2.name) &&
      (cat1.age === cat2.age) &&
      (cat1.color === cat2.color)
  })
}
