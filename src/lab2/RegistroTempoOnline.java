package lab2;

/**
 * manter a informação sobre quantidade de horas de internet que o aluno 
 * tem dedicado a uma disciplina remota
 * @author vanderson*
 */
public class RegistroTempoOnline {
	
//___________________atributos______________________________
/**
* nome da disciplina
*/
	private String nomeDisciplina;
	
/**
*  horas com a disciplina
*/
	private int tempoGastoOnline;
	
/**
*horas para a disciplina 
*/
	private int tempoEsperado=120;
	
//______________________construtores____________________________________
/**
* constroi o tempo online com o nome da disciplina
* @param nomeDisciplina
*/
	
	public RegistroTempoOnline (String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		
	}
	
/**
*constroi o tempo online com o nome da disciplina e o tempo esperado  
* @param nomeDisciplina
* @param tempoOnlineEsperado
*/
	
	public RegistroTempoOnline (String nomeDisciplina, int tempoOnlineEsperado){
		this.nomeDisciplina = nomeDisciplina;
		this.tempoEsperado = tempoOnlineEsperado;
		
	}
	
//___________________________metodos__________________________________________
/**
* recebe o tempo online que do aluno
* @param tempo
*/
	public void adicionaTempoOnline(int tempo) {
		int t = this.tempoGastoOnline+tempo;
		this.tempoGastoOnline = t;
	}
	
/**
* analisar se o tempo online gasto é maior ou igual que o tempo esperado x 2
* @return
*/
	
	public boolean atingiuMetaTempoOnline(){
		if (tempoGastoOnline>=tempoEsperado) {
			return true;
		}else {
			return false;
		}
	}

/**
* @return a String que representa a disciplina e tempoGastoOnline/tempoEsperado
*/
	
	public String toString() {
		return nomeDisciplina+" "+tempoGastoOnline+"/"+tempoEsperado;
		
	}

}
