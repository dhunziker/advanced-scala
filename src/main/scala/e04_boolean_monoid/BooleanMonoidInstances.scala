package e04_boolean_monoid

object BooleanMonoidInstances {
  implicit val booleanAndMonoid = new Monoid[Boolean] {
    override def empty: Boolean = true

    override def combine(x: Boolean, y: Boolean): Boolean = x && y
  }

  implicit val booleanOrMonoid = new Monoid[Boolean] {
    override def empty: Boolean = true

    override def combine(x: Boolean, y: Boolean): Boolean = x || y
  }

  implicit val booleanXorMonoid = new Monoid[Boolean] {
    override def empty: Boolean = false

    override def combine(x: Boolean, y: Boolean): Boolean = (x && !y) || (!x && y)
  }

  implicit val booleanXnorMonoid = new Monoid[Boolean] {
    override def empty: Boolean = true

    override def combine(x: Boolean, y: Boolean): Boolean = (x || !y) && (!x || y)
  }
}
