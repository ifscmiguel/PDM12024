/**
 * 
 *  Desenvolva um programa que solicite um dia e
 *  mês e informe se a data é válida.
 */
fun main() { 
    val dia = 30
    val mes = 3
    
    val diaPorMes = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val meses = arrayOf("jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez")
    
    if(dia in 1..diaPorMes[mes-1] && mes in 1..12){
        println("Dia $dia de ${meses[mes-1]} é válido")
    }
    else{
        println("Data inválida!")
    }
    
}