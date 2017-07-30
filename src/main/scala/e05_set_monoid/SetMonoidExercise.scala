package e05_set_monoid

import e04_boolean_monoid.Monoid

object SetMonoidExercise extends App {
  val s1 = Set(1, 2)
  val s2 = Set(2, 3)
  val s3 = Set(3, 4)

  import SetMonoidInstances.setUnionMonoid

  println(Monoid.associativeLaw(s1, s2, s3))
  println(Monoid.identityLaw(s1))
  println(Monoid[Set[Int]].combine(s1, s2))
}
