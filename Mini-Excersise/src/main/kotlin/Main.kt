fun main() {
    val exercises=9
    var exercisesSolved=1

    exercisesSolved+=exercise2()
    exercisesSolved+=exercise3()
    exercisesSolved+=exercise4()


    println("Number of exercises solved is $exercisesSolved")





}

fun exercise2(): Int{
    var age=16
    println("your age is $age")
    age=30
    println("your age is $age")

   return 1

}
fun exercise3(): Int{
    val a=46
    val b=10

    val answer1=(a*100)+b
    val answer2=(a*100)+(b*100)
    val answer3=(a*100)+(b/10)

    return 1

}

fun exercise4(): Int{
    val answer=(5*3)-(4/2)*2
    println("the answer is $answer")

    return 1

}

fun exercise5 (): Int{
    val a=12.5
    val b=45.6
    val average=(a+b)/2

    println("The average is $average")

    return 1
}