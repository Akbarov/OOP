fun main() {
    var mathTeacher: Person = MathTeacher()

    val programmer: Person = Programmer()

    val person: Person = Driver()

}

open class Person() {
    fun eat() {
        println("Eating")
    }

    fun drinking() {
        println("dringking")
    }

    fun walking() {
        println("walking")
    }

    fun sleeping() {
        println("Sleeping")
    }
}


class MathTeacher : Person() {
    fun teaching() {
        println("teaching")
    }
}

class Programmer : Person() {

    fun writingCode() {
        println("writing")
    }
}

class Driver : Person() {
    fun driving() {
        println("driving")
    }
}




