import javax.management.MBeanRegistration

fun main() {
   println(evenIndices(listOf("Beth","Daisi","Mercy","Alice","Gilly","Eliza","Mike","Isaac","Joy","Ann")))
    println(averageHeight(listOf(1.6,1,5,1.4,1.7,1.8,1.3) as MutableList<Double>))
    peopleAttributes()
    person()
    var car= listOf(
        Car("MKE247",150),
        Car("LIE956",560)


    )
    println(car(listOf(150,560)))

}
fun evenIndices(evenList:List<String>):List<String>{
    var even= mutableListOf<String>()
    for (y in evenList){
        if (evenList.indexOf(y)%2==0){
            even.add(y)
        }

    }
      return even
        }

fun averageHeight(heights:MutableList<Double>):Double{
    var aver=heights.average()
    var together=heights.sum()
    println(together)
    return aver

}

    data class Person(val name:String,val age:Int,val height:Double,val weight:Double)
       fun peopleAttributes(){
         var people= listOf(
             Person("Angela",23,56.3,58.2),
             Person("Nancy",18,45.2,30.2),
             Person("James",30,20.2,10.4),
             Person("John",15,31.2,81.4),
    )
            var miaka=people.sortedByDescending { Person->Person.age }
           println(miaka)

}
data class People(val name:String,val age:Int,val height:Double,val weight:Double)
fun person() {
    var people = mutableListOf(
        Person("Angela", 23, 56.3, 58.2),
        Person("Nancy", 18, 45.2, 30.2),
        Person("James", 30, 20.2, 10.4),
        Person("John", 15, 31.2, 81.4),
    )
    people.addAll(listOf(
        Person("Aluel",23,45.2,23.8),
        Person("Alice",17,89.2,13.0),

    ))
    println(people)
}

    data class Car(var registration:String,var mileage: Int)
    fun car(mileage: List<Int>):Int{
        var speed=mileage.average().toInt()
        return speed

}




