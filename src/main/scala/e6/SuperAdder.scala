package e6

/**
  * Created by Dennis on 27/05/2017.
  */
object SuperAdder {

  import cats.Monoid
  import cats.instances.int._
  import cats.syntax.semigroup.catsSyntaxSemigroup

  // Part 1
  def add(items: List[Int]): Int = items.foldLeft(Monoid[Int].empty)(_ |+| _)

  // Part 2
  def add[A: Monoid](items: List[A]): A = items.foldLeft(Monoid[A].empty)(_ |+| _)
}
