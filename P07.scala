/*(**) Flatten a nested list structure.
  Example:

    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
*/

object P07 {
    def flatten(lst: List[Any]): List[Any] = lst.flatMap {
        case sub: List[_] => flatten(sub)
        case x => List(x)
    }
}
