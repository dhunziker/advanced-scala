package e14_reader_monad

object DbExercise extends App {

  import cats.data.Reader
  import cats.syntax.applicative._

  type DbReader[B] = Reader[Db, B]

  def findUsername(userId: Int): DbReader[Option[String]] =
    Reader((db) => db.usernames.get(userId))

  def checkPassword(username: String, password: String): DbReader[Boolean] =
    Reader((db) => db.passwords.get(username).contains(password))

  def checkLogin(userId: Int, password: String): DbReader[Boolean] =
    for {
      username <- findUsername(userId)
      result <- username.map(checkPassword(_, password)).getOrElse(false.pure[DbReader])
    } yield result

  val db = Db(
    Map(
      1 -> "dade",
      2 -> "kate",
      3 -> "margo"
    ),
    Map(
      "dade" -> "zerocool",
      "kate" -> "acidburn",
      "margo" -> "secret"
    )
  )

  println(checkLogin(1, "zerocool").run(db))
  println(checkLogin(4, "davinci").run(db))
}
