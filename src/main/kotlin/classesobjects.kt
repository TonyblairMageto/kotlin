
class Person{
//Variables/Properties/Attributes/Data Members
    var name:String="Tony"
    var age:Int=100
    var location:String="Nairobi"
    var DOB:Int=1925

    fun eat(){
        println("Eating")
    }
    fun sleep(){
        println("sleeping")
    }
}

fun main(){
    var teacher=Person()
    println(teacher.location)


    teacher.eat()
}