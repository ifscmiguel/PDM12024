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
class Pessoa(val sexo:String, val idade:Int, val tempo:Int){
    fun verificarAposentadoria():Boolean{
        return when(this.sexo){
            "m" -> this.idade>=65 && this.tempo >=30
            "f" -> this.idade>=60 && this.tempo >=25
            else -> false
    	}
    }
}

fun main() {    
    val jucelino = Pessoa("m", 60, 40)
    val joaquina = Pessoa("f", 65, 27)
    // condicionais são expressões e retornam valores    
    if(joaquina.verificarAposentadoria()){
        println("Já pode!")
    }
    else{
        println("Não pode!")
    } 
    
}