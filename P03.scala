/*
(*) Find the Kth element of a list.
    By convention, the first element in the list is element 0.

    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
 */

object P03 {
    def nth[A](n: Int, lst: List[A]): A = {
        if (lst.isEmpty) throw new NoSuchElementException
        else if (n == 0) lst.head
        else nth(n - 1, lst.tail)
    }

}
