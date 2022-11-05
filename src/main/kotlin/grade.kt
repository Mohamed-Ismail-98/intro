fun main(){
    println("Enter Your Grade")
    var grade= readLine()!!.toInt()
    if (grade<=100 && grade>=85){
        println("Excellent")
    }else if (grade<85 && grade>=75){
        println("Very Good")
    }else if (grade<75 && grade>=65){
        println("Good")
    }else if (grade<65 && grade>=50){
        println("Acceptable")
    }else{
        println("Filed")
    }


}