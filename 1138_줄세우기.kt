fun main() = with(System.`in`.bufferedReader())
{
    val n = readLine().toInt()
    val arr:MutableList<Int> =
        readLine().split(" ").map { it.toInt() }.toMutableList()
    arr.add(0,0)
    var res = Array<Int>(n+1) { 11 }
    for (i in 1..n) {
        var cnt = arr[i] + 1
        for (j in 1..n) {
            if (i < res[j]) {
                cnt--
            }
            if (cnt == 0) {
                res[j] = i
                break
            }
        }
    }
    for (i in 1..n) {
        print("${res[i]} ")
    }
}