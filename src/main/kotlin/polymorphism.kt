open class Shape{
   open fun draw(){
        println("Drawing")
    }
}

class rectangle:Shape(){
   override fun draw(){
        println("drawing a rectangle")
    }
}

class square:Shape(){
   override fun draw(){
        println("drawing a square")
    }
}

fun main(){
    var r=rectangle()
    r.draw()

    var s=square()
    s.draw()
}