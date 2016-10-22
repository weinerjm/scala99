/* (*) Reverse a list.
    Example:

    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

object P05 {
    def reverse[A](lst: List[A]): List[A] = lst match {
        case Nil => Nil
        case head :: tail => reverse(tail) ::: List(head)
    }
}
