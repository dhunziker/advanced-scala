package e3

import e3.EqExercise.Cat

/**
  * Created by Dennis on 27/05/2017.
  */
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
