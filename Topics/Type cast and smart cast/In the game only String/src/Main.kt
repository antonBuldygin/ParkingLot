fun <T> getStringsOnly(list: List<T>): List<String> {
    val result = mutableListOf<String>()
    // make your code here
    for (l in list){
        if(l is String){result.add(l)}
        else continue

    }
    return result
}