fun main(){
    greetperson(name = "ladouce")
    var y = division(num1 = 60, num2 = 8)
    println(y)
    var sum=addition(num1=360, num2 = 560, num3 = 90, num4 = 40)
    println(sum)
    var String="i love to dance "
    println(String)
}



fun greetperson(name:String){
    println("hello $name")
}
fun division(num1:Int,num2:Int):Int{
    return(num1%num2)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
var sum=num1+num2+num3+num4
    return(sum)
}
fun statement(myself: String):String{
    return (myself)
}


