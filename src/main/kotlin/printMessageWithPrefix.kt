fun printMessageWithPrefix (messages:Collection<String>,prefix:String){
    messages.forEach{
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val error= listOf("403 Forbidden","404 Not Found")
    printMessageWithPrefix(error,"Error:")
}