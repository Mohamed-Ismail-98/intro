fun main(){
    println("Enter m or s")
    var maritalStatus = readLine().toString()
    var Salary=0
    println("Enter Year of job")
    var  ex = readln().toInt()

    if (maritalStatus == "m") {
        println("Enter Year children number")
        var ch = readln().toInt()
        println("Enter Year of job")
        ex = readln().toInt()
        println("Enter Year children number")
        ch = readln().toInt()
        if (ex >= 0 && ex <= 3) {
            Salary = 1500 + (ex * 50) + (ch * 50)
        } else if (ex >= 4 && ex <= 8) {
            Salary = 1500 + (ex * 100) + (ch * 50)
        } else if (ex >= 8) {
            Salary = 9000
        } else {
            println("ex error")
        }

    }
    else if (maritalStatus == "s") {
        if (ex >= 0 && ex <= 3) {
            Salary = 1200 + (ex * 100)
        } else if (ex >= 4 && ex <= 8) {
            Salary = 1200 + (ex * 200)
        } else if (ex >= 8) {
            Salary = 6000
        } else {
            println("ex error")
        }
    }
    else{
        println("St error Please Enter m or s")
    }
    if (maritalStatus=="m"||maritalStatus=="s"){
        println(Salary)
    }
}