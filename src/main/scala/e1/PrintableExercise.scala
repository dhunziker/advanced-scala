package e1

/**
  * Created by Dennis on 27/05/2017.
  */
object PrintableExercise extends App {

  // Define a dog:
  val dog = Dog("Billy", 4, "orange")

  // Print the dog!
  import PrintableInstances.dogPrintable

  Printable.print(dog)

  import PrintableSyntax.PrintOps

  dog.print
}
