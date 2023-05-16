open class shape{
  open fun area(){
        println("area")
    }
}
class circle:shape(){
  override  fun area(){
        println("circle")
    }
}
class Triangle:shape(){
   override fun area(){
        println("triangle")
    }
}
class rect:shape(){
   override fun area(){
        println("rectangle")
    }
}

fun main(){
    var c=circle()
    c.area()

    var T=Triangle()
    T.area()

    var r=rect()
    r.area()
}

