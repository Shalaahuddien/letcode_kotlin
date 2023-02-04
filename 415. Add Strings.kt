class Solution {
    fun addStrings(num1: String, num2: String): String {
    val res = StringBuilder()
    var i = num1.length - 1
    var j = num2.length - 1
    var carry = 0
    while (i >= 0 || j >= 0) {
        var a = 0
        if (i >= 0) {
            a = num1[i] - '0'
            i--
        }
        var b = 0
        if (j >= 0) {
            b = num2[j] - '0'
            j--
        }
        val sum = a + b + carry
        res.append(sum % 10)
        carry = sum / 10
    }
    if (carry != 0) res.append(carry)
    return res.reverse().toString()
}

}