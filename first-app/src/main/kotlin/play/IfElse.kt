package play

fun main(){
    val x = 3;
    if(x in 1..3){
        println("X está entre 1 e 3")
    }

    if(x !in 5..9){
        println("X nao esta entre 5 e 9")
    }
}

class IfElse {
}