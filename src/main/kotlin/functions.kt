fun main(){
    //predefined Functions
    println("kotlin")


    var squareroot=Math.sqrt(81.0)
    println(squareroot)

    var round=Math.ceil(4.67)
    println(round)

    myFun()
    add(56,78)
    add(1,2)
    add(45,90)
    add(3,7)
    mydetails("Tony",34)
    mydetails("Blair",56)



}
//user-defined Function
fun myFun(){
    println("My name is Tony")
}

fun add(num1:Int, num2:Int){

    println(num1+num2)
}

fun mydetails(name: String, age: Int){

    println("$name is $age years old")
}

