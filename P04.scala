/*
(*) Find the number of elements of a list.
    Example:

    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
*/
object P04 {
    def length[A](lst: List[A]): Int = {
        def len[A](n: Int, lst: List[A]): Int = (n, lst) match {
            case (x, Nil) => x
            case (x, _ :: tail) => len(x+1, tail)
        }
        len(0, lst)
    }
}
