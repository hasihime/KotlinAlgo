fun main(args: Array<String>) {
    val list= listOf(1,2,3,4)
    println(list.filter { it%2==0 })

    val people = listOf(Person("bob",30),Person("alice",20))
    println(people.filter { it.age>=30 })

    println(list.map { it*it })

    val maxAge=people.maxByOrNull(Person::age)!!.age
    people.filter { it.age==
            maxAge }

    //이름만 추출

println(people.map { it.name })

    // 아래와 같이 변환도 가능
    println(Person::name)

    //30살 이상인 사람의 나이만 추출
    println(people.filter { it.age>30 }.map(Person::name))


}