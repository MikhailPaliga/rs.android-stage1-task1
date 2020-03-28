package subtask5

class HighestPalindrome {
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val output = digitString.toCharArray()
        var minDelta = 0
        for (i in 0 until digitString.length / 2) {
            if (digitString[i] != digitString[digitString.length - 1 - i]) {
                minDelta++
            }
        }

        if (k >= minDelta){
            var delta = 0
            if (k > minDelta){
                delta = k - minDelta
                for (i in 0 until delta){
                    output[i] = '9'
                    output[n -1 -i] = '9'
                }
            }
            for (i in delta until n-delta/2){
                if (output[i] != output[n -1 -i]){
                    val temp = maxOf(output[i], output[n -1 -i])
                    if (output[i] != temp)
                        output[i] = output[n -1 -i]
                    else
                        output[n -1 -i] = output[i]
                }
            }
            return output.joinToString("")
        }
        return "-1"
    }
}
