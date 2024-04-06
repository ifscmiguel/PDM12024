/**
 * Desenvolva um programa em Kotlin que informa
se uma pessoa pode ou não se aposentar.
Leia a idade, o sexo e o tempo de serviço de
um trabalhador e escreva se ele pode ou não
se aposentar de acordo com os seguintes
critérios:
– Homens devem ter ao menos 65 anos e ter
trabalhado pelo menos 30 anos
– Mulheres devem ter pelo menos 60 anos e ter
trabalhado ao menos 25 anos.
 */
fun main() {
    val sexo = "m"
    val idade = 65
    val tempo = 30   
    // condicionais são expressões e retornam valores (true|false)
    val aposentar = when(sexo){
        "m" -> idade>=65 && tempo >=30
        "f" -> idade>=60 && tempo >=25
        else -> false
    }
    
    if(aposentar){
        println("Já pode!")
    }
    else{
        println("Não pode!")
    }
    
    
}