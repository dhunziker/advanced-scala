package e4

/**
  * Created by Dennis on 27/05/2017.
  */
object BooleanMonoidExercise extends App {

  println(Monoid.associativeLaw(true, false, true)(BooleanMonoidInstances.booleanAndMonoid))
  println(Monoid.identityLaw(true)(BooleanMonoidInstances.booleanAndMonoid))

  println(Monoid.associativeLaw(true, false, true)(BooleanMonoidInstances.booleanOrMonoid))
  println(Monoid.identityLaw(true)(BooleanMonoidInstances.booleanOrMonoid))

  println(Monoid.associativeLaw(true, false, true)(BooleanMonoidInstances.booleanXorMonoid))
  println(Monoid.identityLaw(true)(BooleanMonoidInstances.booleanXorMonoid))

  println(Monoid.associativeLaw(true, false, true)(BooleanMonoidInstances.booleanXnorMonoid))
  println(Monoid.identityLaw(true)(BooleanMonoidInstances.booleanXnorMonoid))
}
