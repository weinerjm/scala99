/*
(*) Find the last but one element of a list.
    Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
*/

object P02 {
    def penultimate[A](lst: List[A]): A = lst match {
        case x :: _ :: Nil  => x
        case _ :: tail => penultimate(tail)
        case _         => throw new NoSuchElementException
    }
}
