open class Professor(val nome:String){
    var ch = 0
    
    open fun getSalario():Int{
        return this.ch*300
    }
}

class Coordenador(nome:String):Professor(nome){
    
     override fun getSalario():Int{
        return this.ch*300 + 1000
    }
}

fun main() { 
   
    val p1 = Professor("Euclides")
    p1.ch = 16
    println("professor ${p1.nome} recebe R$ ${p1.getSalario()}")
    
    val p2 = Coordenador("Maria")
    p2.ch = 16
    println("professor ${p2.nome} recebe R$ ${p2.getSalario()}")
       
}