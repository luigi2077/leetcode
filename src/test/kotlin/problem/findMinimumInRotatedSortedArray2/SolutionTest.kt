package problem.findMinimumInRotatedSortedArray2

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 3, 5) to 1,
        intArrayOf(2, 2, 0, 1) to 0,
    )
}

