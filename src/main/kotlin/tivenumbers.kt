import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    var number=read.nextFloat()

    if (number>0){
        println("Positive Number")
    }
    else if(number<0){
        println("Negative Number")
    }
   else
       println("Neutral Number")
}


