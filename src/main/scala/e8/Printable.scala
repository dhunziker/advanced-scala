package e8

/**
  * Created by Dennis on 27/05/2017.
  */
trait Printable[A] {
  def format(value: A): String

  def contramap[B](func: B => A): Printable[B] = (value: B) => this.format(func(value))
}
