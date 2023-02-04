class Solution {
    fun isPalindrome(s: String): Boolean {
    val sb = StringBuilder()
    for (c in s) {
        if (c.isLetterOrDigit()) {
            sb.append(c.toLowerCase())
        }
    }
    val str = sb.toString()
    return str == str.reversed()
}

}