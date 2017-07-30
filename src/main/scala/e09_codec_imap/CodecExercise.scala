package e09_codec_imap

object CodecExercise extends App {
  def encode[A](value: A)(implicit c: Codec[A]): String = c.encode(value)

  def decode[A](value: String)(implicit c: Codec[A]): Option[A] = c.decode(value)

  implicit val intCodec = new Codec[Int] {
    def encode(value: Int): String = value.toString

    def decode(value: String): Option[Int] = scala.util.Try(value.toInt).toOption
  }

  case class Box[A](value: A)

  implicit def boxCodec[A](implicit c: Codec[A]) = c.imap[Box[A]](Box(_), _.value)

  println(encode(Box(123)))
  println(decode[Box[Int]]("123"))
}
