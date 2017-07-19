package e1

/**
  * Created by Dennis on 24/05/2017.
  */
object PrintableInstances {
  implicit val stringPrintable = new Printable[String] {
    override def format(value: String): String = value
  }

  implicit val intPrintable = new Printable[Int] {
    override def format(value: Int): String = value.toString
  }

  implicit val dogPrintable = new Printable[Dog] {
    override def format(value: Dog): String = {
      val name = Printable.format(value.name)
      val age = Printable.format(value.age)
      val color = Printable.format(value.color)
      s"$name is a $age year-old $color dog."
    }
  }
}
