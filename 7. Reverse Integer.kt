class Solution {
    fun reverse(x: Int): Int {
    var x = x
    var result = 0
    while (x != 0) {
        val lastDigit = x % 10
        x /= 10
        if (result > Int.MAX_VALUE/10 || (result == Int.MAX_VALUE / 10 && lastDigit > 7)) return 0
        if (result < Int.MIN_VALUE/10 || (result == Int.MIN_VALUE / 10 && lastDigit < -8)) return 0
        result = result * 10 + lastDigit
    }
    return result
}

}