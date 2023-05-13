fun main() {
    // write your code here   
    var str = readln().toString()
    val start = 0
    val end = str.length
    var flag: Boolean = true

//    if(str.length==1){
//        println("no")
//        return
//    }
    for (ind in str.indices) {

        if (str.length>1&&str.first() != str.last()) {
            flag = false
            println("no")
            break
        }
        if (str.length > 2) {
            val first = str.first()
            str = str.substringAfter(first)
//            val last = str.last()
            str = str.substring(0,str.length-1)
//            println(str)
        }
    }
    if (flag) {
        println("yes")
    }

}