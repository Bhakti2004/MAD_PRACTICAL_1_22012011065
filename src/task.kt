class matrix(val rows:Int, val cols:Int){
    val a = Array(rows){IntArray(cols)}
    override fun toString(): String {
        var s = ""
        for(i in 0..<rows){
            s += a[i].joinToString(" ")+"\n"
        }
        return s
    }
}

fun main(){
    val matrix1=matrix(2,2)
    val matrix2=matrix(2,2)

    matrix1.a[0][0]=10
    matrix1.a[0][1]=8
    matrix1.a[1][0]=7
    matrix1.a[1][1]=6

    matrix2.a[0][0]=6
    matrix2.a[0][1]=7
    matrix2.a[1][0]=8
    matrix2.a[1][1]=10

    println(matrix1)


}