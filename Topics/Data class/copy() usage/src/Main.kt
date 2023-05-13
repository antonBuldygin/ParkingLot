// do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    // implement your code here
val h = readln().toInt()
    val l = readln().toInt()
    val l1 = readln().toInt()
    val w = readln().toInt()

    val box = Box(h,l,w)
    val box1 = box.copy(length = l1)
    println(box)
    println(box1)

}