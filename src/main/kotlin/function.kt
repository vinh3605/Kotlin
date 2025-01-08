fun sayHello(name: String):Unit {
    println("Hello "+name)
}
//functions which returns value
fun sum(x: Double, y: Double): Double {
    return x + y
}
fun showColor(red: Int, green: Int , blue: Int, alpha: Float ){
    println("color: $red - $green - $blue - $alpha")

}
// funtion with variadic arguments: - vararg (số lượng đối số không xác )
fun like(vararg fruits:String){
    for(fruit in fruits){
        println("T like $fruit")
    }
}

//infix functions
//can be called without using the period and brackets
infix fun Int.plus(x:Int): Int{
    return this+x
}
infix fun Int.time(x:Int):Int = this * x

infix fun String.love(name:String)= "$this love $name "

//comletion
fun doSomething(x:Int, y:Int , completion:(Int) -> Unit ){
    println("Do something")
    val result = x + y
    completion(result)
}


//fun return fun
fun operation(x:Float): (y:Float) ->Float{
    return fun(y:Float): Float{
        return y*y
    }

 //lambda function


}

val getFullName:(String, String) -> String = { firstName: String, lastName: String ->
    run {
        println("This is a lambda function")
        "$firstName $lastName"
    }
}
//another exam
    val url:(Int, Int)->String = {
        page:Int , limit:Int ->
        "https://yourSeverName:port/products?=$page&limit=$limit "
    }
//another simple example

// Đầu vào là Int đầu ra int, đầu  vào x đầu ra x*x
val squaredNumber:(Int)-> Int = { x-> x*x}

//






