fun salute()=println("Salute!")

fun Person.isAdult()= age>=21

fun main(args: Array<String>) {
    run(::salute)

    val CreatePerson=::Person
    val p=CreatePerson("Alice",29)
    println(p)

    val predicate =Person::isAdult

    println(predicate(p))

}