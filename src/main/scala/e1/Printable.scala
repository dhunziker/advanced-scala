package e1

/**
  * Created by Dennis on 24/05/2017.
  */
trait Printable[A] {
  def format(value: A): String
}

object Printable {
  def format[A](value: A)(implicit p: Printable[A]) = {
    p.format(value)
  }

  def print[A](value: A)(implicit p: Printable[A]) = {
    println(format(value))
  }
}


