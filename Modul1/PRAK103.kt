fun main(){
    println("Masukkan Angka: ")
    var input= readLine()!!.toInt()
    var i = 1
    while (i<5){
        var hasil = i * input
        if (hasil%2==0 || hasil%3==0){
            println(hasil)
        }
        ++i
    }
}
