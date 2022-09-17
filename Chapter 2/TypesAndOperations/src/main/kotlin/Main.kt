fun main() {


    exercises1()
    exercises2()
    workWithStrings()
    pairsWork()



}

fun operations1(){
    val hourlyRate=19.5
    val hoursWorked=10

/*In kotlin we don't need to parse the data to do operations*/

    val totalCost=hourlyRate*hoursWorked

    println("Total cost")

}

/*mini exercises */

fun exercises1(){

    val age1=42
    val age2=21

    println("both values are Integers")

}

fun exercises2(){

    val age1=42.toDouble()
    val age2=21.toDouble()

    val avg1=(age1+age2)/2

    println("Mistake was fixed parsing both values to double")

}

fun workWithStrings(){
    val characterA='a'
    val stringDog="Dog"

    /*double-quotes mean to kotlin that we are working with a multi line string*/
    val bigString="""
        You Can have a String
        that contains multiple
        lines
        by 
        doing this
        """.trimIndent()

    println(bigString)
}

/*
working with pairs and triples
 */

fun pairsWork(){

    val coordinates=Pair(15,12)
    val coordinatesWithTo= 15 to 2
    val mixedCoordinates= 15.25 to 5
    //this is awesome
    val (x1,y1)=coordinates
    val (x2,y2)=coordinatesWithTo

    println("x1 values is $x1 and y1 value is $y1")

}

fun tripleWork(){
    val coordinates3D=Triple(1,45,5)
    val Coordinates3DWithTo=1 to 45 to 5.5

    val (x1,y1,z1)=coordinates3D


}



