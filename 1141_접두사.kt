fun main() = with(System.`in`.bufferedReader())
{
    val n = readLine().toInt()
    val arr = Array<String>(n) { readLine() }
    var result = 0
    arr.sortBy { it.length }
    first@ for (i in 0 until n) {
        for (j in i + 1 until n) {
            if(arr[j].startsWith(arr[i])){
                continue@first
            }
        }
        result++
    }
    print(result)
}