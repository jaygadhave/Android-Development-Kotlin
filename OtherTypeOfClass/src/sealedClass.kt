fun main(args: Array<String>) {

    val bmw: TypeofVehicle = Car("BMW")
    val i20: TypeofVehicle = Car("I 20")

    val honda: TypeofVehicle = Bike("Honda Spelondor", 60000.0)
    val discover: TypeofVehicle = Bike("discover", 80000.0)

}

sealed class TypeofVehicle

class Car(val name: String) : TypeofVehicle()

class Bike(val name: String, val price: Double) : TypeofVehicle()


