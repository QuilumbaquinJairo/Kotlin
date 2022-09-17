import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val exercises=9
    var exercisesSolved=1

    exercisesSolved+=exercise2()
    exercisesSolved+=exercise3()
    exercisesSolved+=exercise4()
    exercisesSolved+=exercise5()
    exercisesSolved+=exercise6()
    exercisesSolved+=exercise7()
    exercisesSolved+=exercise8()
    exercisesSolved+=exercise9()


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

fun exercise6():Int{

    val fahrenheit=25.6
    val celsius=(fahrenheit-32)/1.8
    println("fahrenheit degrees $fahrenheit to celsius %.4f".format(celsius))

    return 1
}

fun exercise7():Int{

    val position=25
    var row=4
    var colum=4



    return 1
}

fun exercise8(): Int{
    val degrees=125.56
    val radians=(degrees* PI)/180

    println("$degrees degrees are equivalent to %.4f rad".format(radians))

    return 1
}

fun exercise9():Int{
    val x1=1.0
    val x2=3.0
    val y1=1.0
    val y2=3.0

    val distance= sqrt((x2-x1).pow(2)+(y2-y1).pow(2))

    println("the distance between the points ($x1,$y1) and ($x2,$y2) is %.3f".format(distance))




    return 1
}