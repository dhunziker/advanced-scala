package e1

/**
  * Created by Dennis on 24/05/2017.
  */
object PrintableSyntax {

  implicit class PrintOps[A](value: A) {
    def format(implicit p: Printable[A]) = p.format(value)

    def print(implicit p: Printable[A]) = println(p.format(value))
  }

}
