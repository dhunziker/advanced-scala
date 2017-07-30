package e05_set_monoid

import e04_boolean_monoid.Monoid

object SetMonoidInstances {
  implicit def setUnionMonoid[A] = new Monoid[Set[A]] {
    override def empty: Set[A] = Set.empty

    override def combine(x: Set[A], y: Set[A]): Set[A] = x ++ y // union
  }
}
