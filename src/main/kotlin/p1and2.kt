class person( var name:String,var age:Int,var job_status:String,var gender:String){
}


fun main(){
    var person1=person("Rita",18,"unemployed","Female")
    println(person1.name+" "+person1.age+" "+person1.job_status+" "+person1.gender)

    var person2=person("David",43,"unemployed","Male")
    println(person2.name+" "+person2.age+" "+person2.job_status+" "+person2.gender)

}