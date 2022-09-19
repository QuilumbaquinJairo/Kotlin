import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
    ranges1()
    forLoop()
    repeatLoop()
    labeledLoops()
    exercise1()
    exercise2()
}

fun ranges1(){

    val closedRange=0..5 //numbers from 0 to 5
    val halfOpenRange=0 until 5//numbers from 0 to 4
    val decreasing=5 downTo 0 //numbers from 5 to 0 in decreasing order
    println("we have created a range of numbers")

}

fun forLoop(){

    val count=10
    var sum=1

    for(i in 1 .. count){
        sum+=i
    }

    println("the value of the sum is $sum")

}


fun repeatLoop(){
    var sum=1
    var lastSum=0

    repeat(10){
        val temp=sum
        sum+=lastSum
        lastSum=temp
    }

    println("sum=$sum, lastSum=$lastSum")



}
/*
the continue statement skips the iteration for which a condition is true
 */

fun labeledLoops(){
    var sum=0
    rowLoop@ for (row in 0 until 8){
        columnLoop@ for (column in 0 until 8){
            if (row==column){
                continue@rowLoop
            }
            sum+= row*column
            println(sum)
        }

    }

    /*
    Mini Exercises
     */


}

fun exercise1(){
    val range= 1 .. 10

    for(i in range){
        println(i*i)

    }

}

fun exercise2(){
    val range=1..10
    for(i in range){
        var sqrtloop=i.toDouble()
        println(sqrt(sqrtloop))

    }

}

