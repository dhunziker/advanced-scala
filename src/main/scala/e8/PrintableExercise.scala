package e8

/**
  * Created by Dennis on 27/05/2017.
  */
object PrintableExercise extends App {
  implicit val stringPrintable = new Printable[String] {
    def format(value: String): String = "\"" + value + "\""
  }

  implicit val booleanPrintable = new Printable[Boolean] {
    def format(value: Boolean): String = if (value) "yes" else "no"
  }

  def format[A](value: A)(implicit p: Printable[A]): String = p.format(value)

  println(format("hello"))
  println(format(true))

  final case class Box[A](value: A)

  implicit def boxPrintable[A](implicit p: Printable[A]) = p.contramap[Box[A]](_.value)

  println(format(Box("hello world")))
  println(format(Box(false)))
  //println(format(Box(123)))
}
