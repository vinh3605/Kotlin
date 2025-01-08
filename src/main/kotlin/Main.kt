package org.kotlintutorial2024


import doSomething
import enums.Quality
import enums.RequestError
import getFullName
import like
import love
import models.User
import operation
import plus
import sayHello
import showColor
import squaredNumber
import sum

import time
import url
import utilities.Caculation


fun main() {
    println("Hello world")
    var x = 5 //this is a variable
    var a: Int = 120
    println("x is : $x, a = $a")
    //you can change value of a variable
    x = 6
    println("x now is : $x")
    val y = 44 //val = cannot be assigned
    //y = 55
    //function = a block of code
    sayHello("Hoang")
    println("sum 2 and 3 is : ${sum(2.0, 3.0)}")

    showColor(255, 0, 0, 0.5f)

    like("Apple", "meomeo")

    val z = 12 plus 5
    println("z = $z")
    println("12 + 5 = ${12 plus 5} ")
    println("10*5= ${10 time 5}")
    var message: String = "John" love "Mary"  //non-null type String
    println(message)

    // ưử lý null
    var email: String?
    email = null
    println("Email's length is: ${email?.length}")
//Nếu expression1 là null, thì expression2 sẽ được sử dụng thay thế
    println("email = ${email ?: "someone@gmail.com"} ")

    //do something
    /*
    doSomething(2,4,
        completion = {ketqua:Int-> run { println(ketqua) }})

}

*/

    //another way
  /*  doSomething(1, 3) { result: Int ->
        run {
            println("result is : $result")
        }
    }

   */
    //simplest
    doSomething(2,3){
        println("result is: $it") //it=item
    }
    //fun return fun
    println("operation = ${operation(10.0f)(30.0f)}")
    println("Full name = ${getFullName("May", "Dit")}")
    println(url(8080,100))
    println(squaredNumber(20))

   //let  chạy nếu objA ko null
    url(8080,100).let {
        println("It means that url is NOT NULL ")

        //it mà đặt ở đâu thì nó sẽ lấy cái biến mà hàm đó muốn dùng . VD hàm ulr , it lấy url
        println(it)
        println("Do more ...")
    }
    //class in Kotlin
    //define an object from class
    val user1 = User(1,"Vinh","aiyeuvin@gmail.com")
    val user2 = User(1,"Vinh","aiyeuvin@gmail.com")
    //2 data object with the same values => the same hashcode
    println(user1.hashCode())
    println(user2.hashCode())
    if (user1.equals(user2)){
        println("user1 and user2 has the same content ")
    }

    user1.name="john"
    //println(user1)
    //user1= User(2,"tinu", "vinh @gmai.com")
    val user3= User(3, "long", "longcak@gmail.com")
    //clone
//    val user4= user3.copy()

    //clones and changes
    val user4 = user3.copy(email="vietnamvodich@gmail.com")
    println(user3)
    println(user4)

    //enum classes
    val quality:Quality=Quality.EXCELLENT
    val qualityMessage:String= when(quality){
        //when= swwitch case
        //vừa tạo ra vừa
        Quality.BAD -> "this is bad"
        Quality.NORMAL->"this is nomal"
        Quality.GOOD -> "this is good"
        Quality.EXCELLENT -> "this is excellent"
    }
    println(qualityMessage)
    val requestError:RequestError = RequestError.SUCCESS
    println(requestError)//in ra loai nào ở 123
    println(requestError.message) //in ra tin nhắn được chọn ơ 123
    println(requestError.wordCount())
    // define a key-values object
    var person1 = object {

        var name = "Hoang"
        var emailAdress = "sunlinght4@gmail.com"
        var age= 28
        override fun toString(): String=
            "name:$name, email=$emailAdress, age=$age "
    }
    println(person1)
    var person2 = mutableMapOf<String, Any>(
        "name" to "Vinh" ,
        "email" to "vietnamvodich@gmail.com",
        "age" to 12
    )
    person2["email"] = "Vinhdepzai@gmail.com" // you can change if person 2 is a "mutable map"
    person2["age"] = "19"
    println(person2)
    //companion object => like static
    println(Caculation.multiply(3,5))
    println("PI = ${ Caculation.PI}")








}




