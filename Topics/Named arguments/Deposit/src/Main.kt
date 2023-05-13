fun main() {
    // write your code here
    val par = readln().toString()
    val amount = readln().toInt()

    when (par) {
        "amount" -> calc(amount=amount)
        "percent" -> calc(percent = amount)
        "years" -> calc(years = amount)

    }


}
fun calc(amount:Int=1000, percent:Int=5, years:Int=10 ){
    val pow = Math.pow(((1.0 + percent.toDouble() / 100.0)), years.toDouble())


    val calcRes= amount*pow
    println(calcRes.toInt())
}