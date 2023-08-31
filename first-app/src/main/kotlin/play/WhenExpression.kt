package play

fun main(){
    println(whenAssign(1))
    println(whenAssign(42L))
    println(whenAssign(4.2))
    println(whenAssign(WhenExpression()))
    println(whenAssign("Hello"))

}

fun whenAssign(obj: Any): Any{
    val result = when (obj){
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result;
}


class WhenExpression {
}