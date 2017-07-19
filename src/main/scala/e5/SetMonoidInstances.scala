package e5

import e4.Monoid

/**
  * Created by Dennis on 27/05/2017.
  */
object SetMonoidInstances {

  implicit def setUnionMonoid[A] = new Monoid[Set[A]] {
    override def empty: Set[A] = Set.empty

    override def combine(x: Set[A], y: Set[A]): Set[A] = x ++ y // union
  }
}
