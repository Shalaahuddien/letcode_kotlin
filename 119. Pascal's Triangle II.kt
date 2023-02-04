class Solution {
    fun getRow(rowIndex: Int): List<Int> {
    val result = MutableList(rowIndex + 1) { 0 }
    result[0] = 1
    for (i in 1..rowIndex) {
        for (j in i downTo 1) {
            result[j] += result[j - 1]
        }
    }
    return result.toList()
}

}