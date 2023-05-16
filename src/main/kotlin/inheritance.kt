open class Animal{
    var age:Int=12
    var gender:String="Female"

    fun animal(){
        println("is Mammal")
    }
}

class Duck:Animal(){
    var color:String="Black"

    fun swimo(){
        println("can swim")
    }
}

class Fish:Animal(){
    var canEAT:Boolean=true

    fun swim(){
        println("can swim")
    }
}

class Horse:Animal(){
    var wild:Boolean=false

    fun run(){
        println("can run")
    }

}
fun main(){
    var d=Duck()
    println(d.age)

    var h=Horse()
    h.animal()

    var f=Fish()
    println(f.canEAT)
}