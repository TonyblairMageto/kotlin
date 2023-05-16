class dog(var Breed:String,var size:String,var Age:Int,var color:String){


    fun Eat(food:String){
        println("Bones")

    }

    fun Sleep(){
        println("sleeping")
    }
    fun sit(){
        println("sitting")
    }
    fun Run(){
        println("running")
    }

}

fun main(){
    var np=dog("Neapolitan Mastiff","Large",5,"Black")
    println(np.Breed)
    np.Eat("Bones")

    var m=dog("Maltese","Small",2,"White")
    println(m.Breed)
    m.Sleep()

    var cc=dog("Chow Chow","Midian",3,"Brown")
    println(cc.Breed)
    cc.Run()
}
