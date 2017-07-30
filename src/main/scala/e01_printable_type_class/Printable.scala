package e01_printable_type_class

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
