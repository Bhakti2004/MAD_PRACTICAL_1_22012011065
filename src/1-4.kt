fun main(){
    print("Enter a Number : ")
    val a = readLine()!!.toInt()

    println(
        if (a%2 == 0) {
            "$a is Even Number"
        }
        else{
            "$a is Odd Number"
        }
    )
}