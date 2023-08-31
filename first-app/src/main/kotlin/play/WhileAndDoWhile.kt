package play

fun eatCake()= println("Eat a cake")
fun bokeACoke() = println("Bake a Cake")

fun main(){
    var cakesEaten = 0;
    var cakesBaked = 0;

    while(cakesEaten < 5){
        eatCake();
        cakesEaten++;
    }

    do{
        bokeACoke();
        cakesBaked++;
    }while(cakesBaked < cakesEaten)
}


class WhileAndDoWhile {
}