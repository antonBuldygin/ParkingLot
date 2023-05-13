fun main() {
    // write your code here
    val str = readln().toString()
    var finstr =""
    for (i in 0 until str.length){
        var count=1
        if(i!=0&&str[i]==str[i-1]){continue}

        for (j in i+1 until str.length){
            if(str[i]!=str[j]){break}
            if(str[i]==str[j]){
                count++

            }
        }
      finstr=finstr+str[i]+count


    }

    println(finstr)
}