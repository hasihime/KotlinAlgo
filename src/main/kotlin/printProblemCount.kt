fun printProblemCount(responses: Collection<String>) {
    //람다가 사용할 변수를 정의한다.
    var clientErrors = 0
    var severErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++  //람다 안에서 람다 밖의 변수 수정 가능
        } else if (it.startsWith("5")) {
            severErrors++
        }
    }
    println("$clientErrors client errors. $severErrors server errors")
}