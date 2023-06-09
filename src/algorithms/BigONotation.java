package algorithms;

public class BigONotation {
    /**
     * Big O Notation (how code slows as data grows):
     * it describes the performance of an algorithm as the amount of data
     * increases.
     *
     * it is machine independent but we are focusing on the "number of steps" to
     * complete an algorithm.
     *
     * examples of Big O notations:
     * O(1)
     * O(n)    (n = amount of data)
     * O(log n)
     * O(n^2)
     * ...
     */

    /**
     * concrete example:
     * addUp1() method will add up to a certain number (n).
     *
     * ex:
     * if n = 3 -> sum = 0 + 1 + 2 + 3 -> sum = 6.
     * here, the number of steps is 4 because we have one operation
     * (sum + i) repeated 4 times (n <= 3)
     *
     * so if n = 1000000 (large number) then the number of steps will be more than
     * 1000000
     */

    public int addUp1(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * this function is going to have runtime complexity of O(n) "linear time"
     * because as the amount of data increases, it is going to increase the
     * amount of steps, linearly.
     */

    /**
     * here is another way to write the same function:
     */
    public int addUp2(int n){
        int sum = n * (n + 1) / 2;
        return sum;
    }

    /**
     * here if n = 1000000 then the number of steps will be 3 because we have 3
     * operations (n * (n + 1) / 2) repeated 1 time only.
     *
     * this function is going to have runtime complexity of O(1) "constant time"
     * because the amount of data does not matter. it is going to be completed
     * in the same amount of steps which is 3.
     *
     * so addUp2() is better than addUp1().
     */

    /**
     * runtime complexities:
     *
     * O(1) = constant time:
     * anything has a runtime complexity of O(1) will take the same amount of
     * time regardless of the data size.
     * ex:
     * .random access of an element in an array.
     * .inserting at the beginning of a linkedList.
     *
     *
     * O(log n) = logarithmic time:
     * anything has a runtime complexity of O(log n) will take increasingly less
     * time to complete.
     * in other words, as the data size increases, the algorithm is going to be
     * more efficient.
     * ex:
     * .binary search.
     *
     *
     * O(n) = linear time:
     * as the data size increases, the time it takes to complete something
     * will increase proportionally, linearly.
     * ex:
     * .looping through elements in an array.
     * .searching through a linkedList.
     *
     *
     * O(n log n) = quasi-linear time:
     * for the most part, it is very similar to linear time unless we are
     * working with a large data set.
     * anything using O(n log n) is going to slowdown when we work with larger
     * data sets.
     * ex:
     * .quick-sort.
     * .merge-sort.
     * .heap-sort.
     *
     *
     * O(n^2) = quadratic time:
     * as the amount of data increases, anything has a runtime complexity of
     * O(n^2) is going to take increasingly more time to complete.
     * ex:
     * .insertion sort.
     * .selection sort.
     * .bubble sort.
     *
     * O(n): if n = 1000 then the number of steps is 1000.
     * O(n^2): if n = 1000 then the number of steps is 1000^2 which is 1000000.
     *
     *
     * O(n!) = factorial time:
     * as the amount of data increases, anything has a runtime complexity of
     * O(n^2) is going to take increasingly more time to complete.
     * ex:
     * .Traveling Salesman Problem.
     * (some of these runtime complexities are efficient when working with a
     * smaller data set)
     */

    /**
     * letter grade: (when working with large data sets)
     * O(1): A (Excellent).
     * O(n): B (Pretty good).
     * O(log n): C (Okay).
     * O(n log n): D (Barely passing).
     * O(n^2): E (Bad).
     * O(n!): F (Expelled).
     */
}
