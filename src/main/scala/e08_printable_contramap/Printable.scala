package e08_printable_contramap

trait Printable[A] {
  def format(value: A): String

  def contramap[B](func: B => A): Printable[B] = (value: B) => this.format(func(value))
}
