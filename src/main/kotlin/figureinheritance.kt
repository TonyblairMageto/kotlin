open class Figure{
    var start:String="start"

    fun Area(){
        println("Find the area")
    }

    fun perimeter(){
        println("find the perimeter")

    }

    fun Draw(){
        println("Draw the figure")
    }

}

class Circle:Figure(){
    var radius:String="ten"


    fun area(){
        println("one ten")
    }

    fun peri(){
        println("thirty")

    }

    fun draw(){
        println("Draw the Circle")
    }

}

open class Rectangle:Figure(){
    var width:String="five"
    var height:String="twenty"

    fun are() {
        println("fifty")
    }
    fun per(){
        println("twelve")
    }
    fun dr(){
        println("draw")
    }
}

class Square:Rectangle(){

}

fun main(){
    var c=Circle()
    println(c.start)

    var s=Square()
    s.per()

    var r=Rectangle()
    r.Area()
}

