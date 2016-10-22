/* (**) Pack consecutive duplicates of list elements into sublists.
    If a list contains repeated elements they should be placed in separate sublists.

    Example:

    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/

object P09 {
    def pack[A](lst: List[A]): List[List[A]] = lst match {
        case Nil => Nil
        case h :: tail => (h :: tail.takeWhile(_ == h)) :: pack(tail.dropWhile(_ == h))
    }
}
