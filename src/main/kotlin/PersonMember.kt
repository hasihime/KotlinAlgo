
val getAge=Person::age

fun main(args:Array<String>) {
    val people= listOf(Person("bob",29),Person("alice",31))

    people.maxByOrNull(Person::age)
    people.maxByOrNull{p->p.age}
    people.maxByOrNull{it.age}
}
