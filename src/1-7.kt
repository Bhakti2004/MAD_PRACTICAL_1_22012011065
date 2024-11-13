class Car (
    var type : String,
    var model : Int,

    var Oprice : Double,
    var Cprice : Double,
    var owner : String,
    var milesdrive : Int)
{
    init {
        println("Object of class is created and Init is Called.")
    }
    fun getOriginalCarPrice(): Double {
        return Oprice
    }
    fun getCurrentCarPrice(): Double {
        return Cprice
    }
    fun displayCarInfo() {
        val originalPrice = getOriginalCarPrice()
        val currentPrice = getCurrentCarPrice()
        println("Car Information : $type, $model")
        println("Car Owner : $owner")
        println("Miles Drive : $milesdrive")
        println("Original Car Price : $originalPrice")
        println("Current Car Price : $currentPrice")
    }
}
fun main() {

    var car1 = Car("KIA",2022, 100000.0,98950.0, "Bhakti",105 )
    var car2 = Car("BMW",2019, 400000.0,399800.0, "Bansi",20 )
    car1.displayCarInfo()
    car2.displayCarInfo()
    var cars = ArrayList<Car>()
    cars.add(Car("Audi",2017, 1080000.0,1079000.0, "Mahi",100 ))
    cars.add(Car("Maruti",2020, 4000000.0,3998000.0, "Priya",200 ))
    println("********** ArrayList of Car **********")
    for (car in cars) {
        car.displayCarInfo()
    }
}
