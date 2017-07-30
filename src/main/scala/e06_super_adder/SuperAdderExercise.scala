package e06_super_adder

import cats.Monoid

object SuperAdderExercise extends App {

  // Part 1
  println(SuperAdder.add(List(1, 2, 3)))

  // Part 2
  import cats.instances.int.catsKernelStdGroupForInt
  import cats.instances.option.catsKernelStdMonoidForOption

  println(SuperAdder.add(List(Some(1), Some(2), Some(3), None)))

  // Part 3
  case class Order(totalCost: Double, quantity: Double)

  implicit val orderMonoid = new Monoid[Order] {
    override def empty: Order = Order(0, 0)

    override def combine(x: Order, y: Order): Order = {
      import cats.instances.double.catsKernelStdGroupForDouble
      val totalCost = Monoid[Double].combine(x.totalCost, y.totalCost)
      val quantity = Monoid[Double].combine(x.quantity, y.quantity)
      Order(totalCost, quantity)
    }
  }

  val orders = List(Order(1.0, 1.0), Order(2.0, 2.0), Order(3.0, 3.0))
  println(SuperAdder.add(orders))
}
