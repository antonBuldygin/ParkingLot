fun main() {
    val line= readlnOrNull()?:throw IllegalStateException()
    println("Elvis says: $line") // you need to add something
}
fun readLine(){
    val line= readlnOrNull()?:throw IllegalStateException()
    println("Elvis says: $line")
}