class Dog(var color:String,var breed:String,var sex:String,var age:Int){

}
fun main(){
    var d=Dog("brown", "German Sherphard", "Female",6)
    println(d.color +" "+ d.breed+" "+ d.sex+" "+d.age)

    var puppy=Dog("white","Chiwawa","male",3)
    println(puppy.color+" "+ puppy.breed+" "+ puppy.sex+" "+ puppy.age)

}

