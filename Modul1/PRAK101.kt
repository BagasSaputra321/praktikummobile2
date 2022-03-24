fun main (){
    println("Waktu Sekarang: ")
    var Waktu = readLine()
    println("Nama Anda: ")
    var Nama = readLine()
    println("Umur Anda: ")
    var Umur = readLine()!!.toInt()
    println("Suhu Tubuh: ")
    var Suhu = readLine()!!.toFloat()
    println("Selamat $Waktu, $Nama. Umur anda $Umur Tahun. Suhu tubuh anda $Suhu derajar celcius")
}