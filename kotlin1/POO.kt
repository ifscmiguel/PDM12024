class Curso(n:String){
    
    var nome=n
    set(value){
        field = "$value, mas CSTSI é melhor"
    }
    get(){
        return "curso $field"
    }
    
    // outro atributo ch
    var ch = 0
    set(value){
        if(value<0){
            println("ch inválida")
        }
        else{
            field = value
        }
    }
        
}

fun main() { 
   
    val c = Curso("CSTSI")
    c.ch = -600
    println( "${c.nome} carga horária ${c.ch}" )
    
    
    c.nome = "Gestão Ambiental"
    println( c.nome )
    
    
}