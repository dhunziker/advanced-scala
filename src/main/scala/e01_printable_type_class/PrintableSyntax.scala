package e01_printable_type_class

object PrintableSyntax {

  implicit class PrintOps[A](value: A) {
    def format(implicit p: Printable[A]) = p.format(value)

    def print(implicit p: Printable[A]) = println(p.format(value))
  }

}
