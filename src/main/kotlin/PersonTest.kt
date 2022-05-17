data class Person(val name: String, val age: Int)

//fun findTheOldest(people: List<Person>) {
//    var maxAge = 0
//    var theOldest: Person? = null
//
//    for (person in people){
//        if(person.age>maxAge){
//            maxAge=person.age
//            theOldest=person
//        }
//    }
//println(theOldest)
//}


fun main(args: Array<String>) {
    // 람다식으로 변형
    val people = listOf(Person("alice", 24), Person("bob", 31))
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))
    // 람다식 표현
    people.maxByOrNull ({ p: Person -> p.age })
    people.maxByOrNull (){ p: Person -> p.age }

    //람다식은 중괄호에 위치하며 화살표 왼쪽은 파라미터, 오른쪽은 본문이 위치한다.
    val sum = { x: Int, y: Int -> x + y }

    println(sum(1, 2))
}
