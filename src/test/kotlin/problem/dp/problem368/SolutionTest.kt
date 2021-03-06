package problem.dp.problem368

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, List<Int>>() {
    override val solutions: List<ISolution<IntArray, List<Int>>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, List<Int>>> = listOf(
        intArrayOf(1, 2, 3) to listOf(1, 3),
        intArrayOf(1, 2, 4, 8) to listOf(1, 2, 4, 8),
    )
}
