package e01_printable_type_class

object PrintableExercise extends App {
  // Define a dog:
  val dog = Dog("Billy", 4, "orange")

  // Print the dog!
  import PrintableInstances.dogPrintable

  Printable.print(dog)

  import PrintableSyntax.PrintOps

  dog.print
}
