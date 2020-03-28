package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var total = mutableListOf<String>()

        for (i in inputString.indices){
            if (inputString[i] == '<')
                total.add(cutString(inputString.substring(i), '<', '>'))
            if (inputString[i] == '(')
                total.add(cutString(inputString.substring(i), '(', ')'))
            if (inputString[i] == '[')
                total.add(cutString(inputString.substring(i), '[', ']'))
        }
        return total.toTypedArray()
    }
}

fun cutString(string: String, conditionStart: Char, conditionEnd: Char): String{
    var result = ""
    var decide = 0

    for (i in 1 until string.length) {
        if (string[i] == conditionStart)
            decide++
        else if (string[i] ==
            conditionEnd && decide != 0)
            decide--
        else if (string[i] == conditionEnd && decide == 0) {
            result = string.substring(1, i)
            break
        }
    }

    return result
}
