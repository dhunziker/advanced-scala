package e7

import cats.Functor

/**
  * Created by Dennis on 27/05/2017.
  */
object TreeExercise extends App {

  implicit def treeFunctor = new Functor[Tree] {
    override def map[A, B](fa: Tree[A])(f: (A) => B): Tree[B] = fa match {
      case Branch(l, r) => Branch[B](map(l)(f), map(r)(f))
      case Leaf(v) => Leaf(f(v))
    }
  }

  def branch[A](left: Tree[A], right: Tree[A]): Tree[A] = Branch(left, right)

  def leaf[A](value: A): Tree[A] = Leaf(value)

  val tree = branch(leaf(1.0), branch(leaf(2.0), leaf(3.0)))
  println(tree)

  import cats.syntax.functor.toFunctorOps

  println(tree.map(_ * 2))
}
