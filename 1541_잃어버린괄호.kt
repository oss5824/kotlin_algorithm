fun main() = with(System.`in`.bufferedReader())
{
    val str = readLine().split("-")
    var result = str[0].split("+").sumOf { it.toInt() }
    val sz = str.size
    for (i in 1 until sz) {
        result -= str[i].split("+").sumOf { it.toInt() }
    }
    print(result)
}