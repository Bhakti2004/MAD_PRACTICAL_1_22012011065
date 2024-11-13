fun factorial(n: Int): Int {
    if (n >= 1)
        return (n * factorial((n - 1)))
    else
        return 1
}
fun main(){
    val num=4
    val x=factorial(num)
    println("Factorial of number $num is $x")
}



