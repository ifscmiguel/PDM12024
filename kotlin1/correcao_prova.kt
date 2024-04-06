// correção parcial da prova de Java em Kotlin

/* Pessoa */
abstract class Pessoa(val nome:String){
    lateinit var cpf:String
}

/* Aluno */
class Aluno(nome:String, val num_matricula:Int):Pessoa(nome){ }

/* Professor */
class Professor(nome:String, val especialidade:String):Pessoa(nome){ }

/* Disciplina */
class Disciplina(val nome:String, ch:Int){
    
    lateinit var prof:Professor
    val alunos = mutableListOf<Aluno>()
    
    var ch=ch
    set(value){
        if(value in 1..200){
            field = value
        }
        else{
            throw IllegalArgumentException("CH precisa ser positiva menor que 200")
        }
    }
    
    // esta extensão do construtor chama o setter
    init{
        this.ch = ch
    }
    
    // adicionar aluno na lista
    fun addALuno(a:Aluno){
        this.alunos.add(a)
    }
    
    //lista de alunos
    fun listarAlunos(){
        println("\n** Lista de alunos: **")
        for(e in this.alunos){
            println(e.nome)
        }
    }
}


// Início
fun main() {    
    try{
       val d1 = Disciplina("BD", 200)
       val a1 = Aluno("Joaquina", 123)
       val a2 = Aluno("Adalberto", 234)
       val a3 = Aluno("Gerônimo", 345)
       
       d1.addALuno(a1)
       d1.addALuno(a2)
       d1.addALuno(a3)
       
       d1.listarAlunos()
    }
    catch(e:Exception){
        println(e.message)
    }
}