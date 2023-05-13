fun main() {
    var distance = readLine()!!.toInt() // the distance back
    var totalDistance = readLine()!!.toInt()
    var distance1 =0
    // fix the code below
    if (distance < 0) {
         distance1 = -distance
    }else distance1 = distance
    totalDistance += distance1
    println(totalDistance)
}