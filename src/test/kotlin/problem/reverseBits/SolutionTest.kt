package problem.reverseBits

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {
    private val solution = Solution()

    override val solutions: List<ISolution<Int, Int>> = listOf(solution)
    override val testCases: List<Pair<Int, Int>> = listOf(
        Pair(43261596, 964176192),
        Pair(-3, -1073741825),
    )
}
