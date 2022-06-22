
val canbBeInClub27= {p:Person ->p.age<=27}

fun main(args: Array<String>) {
    val people= listOf(Person("Alice",27), Person("Bob",31))

    //all -> 모든 요소가 true인가
    println(people.all(canbBeInClub27))
    //any -> 하나의 요소라도 있는가
    println(people.any(canbBeInClub27))
    //count -> 원소의 갯수.
    println(people.count(canbBeInClub27))
    //find -> 만족하는 원소를 찾기. 없으면 null 반환
    println(people.find(canbBeInClub27))

    val people2= listOf(Person("Alice",27), Person("Bob",31),Person("Carol",31))

    //groupby -> 특성을 파라미터로 전달하면 컬렌션을 자동으로 구분해줌

    println(people2.groupBy{it.age})
    
}