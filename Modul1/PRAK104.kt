class otomotif{
    private val Merk = arrayOf("Yamaha" , "Honda" , "Suzuki")
    private val Jenis = arrayOf("motor bebek" ,"motor Matic" , "motor Kopling")

    fun Tahun2018() {
        println("Merk pada tahun 2018 adalah "+Merk.get(1))
        println("Dengan jenis "+Jenis.get(0))
    }
    fun Tahun2019(){
        println("Merk pada tahun 2019 adalah "+Merk.get(2))
        println("Dengan jenis "+Jenis.get(2))
    }
    fun Tahun2020(){
        println("Merk pada tahun 2020 adalah "+Merk.get(2))
        println("Dengan jenis "+Jenis.get(1))
    }
    fun Tahun2021(){
        println("Merk pada tahun 2021 adalah "+Merk.get(0))
        println("Dengan jenis "+Jenis.get(2))
    }
    fun Tahun2022(){
        println("Merk pada tahun 2022 adalah "+Merk.get(1))
        println("Dengan jenis "+Jenis.get(1))
    }
}

fun main() {
    var otomotif = otomotif()
    otomotif.Tahun2018()
    otomotif.Tahun2019()
    otomotif.Tahun2020()
    otomotif.Tahun2021()
    otomotif.Tahun2022()
}