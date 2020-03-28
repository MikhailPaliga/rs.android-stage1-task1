package subtask3

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, n: Int, k: Int): String {
        val annaCustomer = (bill.sum() - bill[n])/2
        return if (k === annaCustomer){
            "Bon Appetit"
        }else {
            (k - annaCustomer).toString()
        }
    }
}