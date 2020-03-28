package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var n = 1
        val MyHappyArray = sadArray.toMutableList()

        while (n < MyHappyArray.size - 1) {
            if ( n != 0 && MyHappyArray[n] > MyHappyArray[n + 1] + MyHappyArray[n - 1]) {
                MyHappyArray.removeAt(n)
                n --
            } else {
                n ++
            }
        }
        return MyHappyArray.toIntArray()
    }
}
