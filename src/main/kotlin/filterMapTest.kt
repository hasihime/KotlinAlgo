fun main(args: Array<String>) {
    val list= listOf(1,2,3,4)
    println(list.filter { it%2==0 })

    val people = listOf(Person("bob",30),Person("alice",20))
    println(people.filter { it.age>=30 })

    println(list.map { it*it })
}