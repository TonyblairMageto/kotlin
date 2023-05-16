class Car(){
    var name:String="Nissan"
    var mod:String="Audi"
    var col:String="red"
    var ds:Int=360


    fun drive(){
        println("drive")
    }

    fun turn(){
        println("turn")
    }

    fun stop(){
        println("stop")
    }
}

fun main(){
   var driver=Car()
    println(driver.name+" "+driver.mod+" "+driver.col+" "+driver.ds)
    driver.drive()

}