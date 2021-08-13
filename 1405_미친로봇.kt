import java.util.*

var n = 0
var arr = doubleArrayOf(0.0, 0.0, 0.0, 0.0)
val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)
var visit = Array(32, { Array(32, { false }) })
var result = 0.0
fun dfs(x: Int, y: Int, p: Double) {
    if (n == 0) {
        result += p
        return
    }
    for (i in 0..3) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (visit[ny][nx] || arr[i] == 0.0) continue
        n--
        visit[ny][nx] = true
        dfs(nx, ny, p * arr[i])
        n++
        visit[ny][nx] = false
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    n=sc.nextInt()
    for (i in 0..3) {
        arr[i] = sc.nextInt() * 0.01
    }
    visit[15][15] = true
    dfs(15, 15, 1.0)
    print(result)
}

