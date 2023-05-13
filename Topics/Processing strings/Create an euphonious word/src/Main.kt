fun main() {
    // write your code here
    val str = readln().toString()
    val voul = listOf<Char>('a', 'e', 'i', 'o', 'u', 'y')
    var inrow: Boolean = false
    var inrowd: Boolean = false
    var count = 0
    var add = 0
    for (i in 0 until str.length) {



        if (str[i].toChar() in voul && inrow) {

            count++

            if (count == 3) {
                add++
                count = 1

            }
        }
        if (str[i].toChar() in voul && !inrow) {

            count = 1
            inrow = true
            inrowd = false
        }

        if (str[i].toChar() !in voul && inrowd) {

            count++

            if (count == 3) {
                add++
                count = 1

            }
        }
        if (str[i].toChar() !in voul && !inrowd) {

            count = 1
            inrowd = true
            inrow = false
        }

    }
    println(add)
}
