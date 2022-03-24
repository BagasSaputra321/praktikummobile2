fun main(){
    println("Masukkan Angka: ")
    var input= readLine()!!.toInt()
    for (i in 2..8){
        var hasil = i * input
        if (hasil%2==0 || hasil%3==0){
            println(hasil)
        }
    }
}