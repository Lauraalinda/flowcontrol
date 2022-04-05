
fun main() {
 oddnumbers()
    var output=name(arrayOf("laura","alinda","kengaaju","kenyana"))
    println(output)

    drink(90)
    numbers()
}
fun oddnumbers(){
    for(nums in 1..100) {
        if ((nums % 2) != 0) {
            println(nums)
        }
    }
}
fun name(names:Array<String>):Int{
    var name=0
    names.forEach { x->
        if( x.length>5){
            name++
    }
    }
      return name
}


fun drink(age:Int){
    if(age<=6){
        println("milk")
    }
    else if(age>=6 && age<=15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}

fun numbers() {
    for (multi in 1..100) {
        if ((multi % 3) == 0 && (multi % 5) == 0) {
            println("FizzBuzz")
        } else if ((multi % 3) == 0) {
            println("Fizz")
        } else if ((multi % 5) == 0) {
            println("Buzz")
        }else{
            println(multi)

            }

        }

    }



