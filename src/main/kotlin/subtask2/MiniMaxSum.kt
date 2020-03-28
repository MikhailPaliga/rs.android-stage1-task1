package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        var numSum = input.min()
        var minValue = 0
        if (numSum != null) minValue = numSum

        numSum = input.max()
        var maxNumber = 0
        if (numSum != null) maxNumber = numSum

        val maxSum = input.sum() - minValue
        val minSum = input.sum() - maxNumber

        return intArrayOf(minSum, maxSum)
    }
}
