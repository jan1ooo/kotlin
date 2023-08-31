package play // Definição do pacote, caso não seja especificado, ficará no diretório padrão.

/* UNIT é igual um VOID em java, significa que a function não tem retorno. */
fun printMessage(message: String): Unit {
    println(message)
}

/* Function com um segundo parâmetro optional, se ele não for informado, ficará como "Info".
 Novamente a função não tem retorno, não é necessário colocar o Unit.
 $message chamar a variável e imprime.
*/
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/* Function que retorno um inteiro e recebe dois inteiros para fazer a soma. */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/* Function de expressão única, como se fosse uma ArrowFunction em JS.
Retorna um número inteiro(inferido). */
fun multiply(x: Int, y: Int) = x * y

fun main(){
    printMessage("Hello world")
    printMessageWithPrefix("Olá", "Log")
    printMessageWithPrefix("Olá")

    /* Chamando a function usando os argumentos nomeados e alterando a ordem deles. */
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(2, 4))
    println(multiply(2, 4))

    /* Um array de argumentos do tipo string e dentro existe um foreach que busca as mensagens dentro desta lista. */
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")

    /* Aceita dois parâmetros, um array de string e uma string.
     Faz um foreach novamente e imprime o prefix static com a mensagem. */
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )

    /* Está chamando uma função que recebe um vararg, então o operador (*) deixa explicito que o campo é um vararg, se
     não passar, ele será reconhecido como um array. */
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}


