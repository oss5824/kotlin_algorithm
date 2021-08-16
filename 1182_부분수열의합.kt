fun main() = with(System.`in`.bufferedReader())
{
    var str = readLine().split(" ")
    val n = str[0].toInt()
    val s = str[1].toInt()
    var res = 0
    str = readLine().split(" ")

    for (i in 1 until (1 shl n)) {
        var sum = 0
        var m = i
        var cnt = 0
        while (m != 0) {
            if (m and 1 == 1) {
                sum += str[cnt].toInt()
            }
            m = m shr 1
            cnt++
        }
        if (sum == s) {
            res++
        }
    }
    print(res)
}