package lab2;

/**
* Todo aluno na sua vida academica precisa ter uma rotina de descanso de 
* pelo menos 26 horas por semana, ou mais. 
* 
* @author Vanderson dos Santos Araújo
*/

public class Descanso {

//___________________atributos__________________________	

/**
 * Quantas horas o aluno descansou
 * obs.: começar com um pq é menor que 26 e inicialmente ele tá cansado
 */
	private int horasDescanso=1; 

/**
* quantas semanas o aluno descansou
*/
	private int numerosSemana=1;

//_____________________metodos_______________________________
	
/**
 * Recebe o valor de descanso
 * @param valor
 */
	public void defineHorasDescanso(int valor) {
		this.horasDescanso = valor;
	}
	
/**
 * recebe o numero de semanas
 * @param valor
 */
	public void defineNumeroSemanas(int valor) {
		this.numerosSemana = valor;
	}
	
/**
 * Retorna se o aluno ta cansado ou descansado	
 * @return
 */
	
	public String getStatusGeral() {
		double cansado = horasDescanso/numerosSemana;
		if (cansado>=26){
			return "descansado";
		}else {
			return "cansado";
		}
		
	}
}
