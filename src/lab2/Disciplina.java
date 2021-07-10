package lab2;

/**
 * Disciplina do aluno, é nesse classe que trabalhamos com a notas do aluno
 * @author vanderson
 *
 */

public class Disciplina {

/**
 *nome da disciplina 
 */
	private String nomeDisciplina;
	
/**
 *horas de estudo do aluno 
 */
	private int horasEstudo;
	
/**
 * notas dos alunos, nota1, ...nota4.
 */
	private double nota1=0;
	private double nota2=0;
	private double nota3=0;
	private double nota4=0;

//____________________________construtores_________________________
/**
 *construtor da disciplina que recebe como parametro o nome da disciplina 	
 * @param nomeDisciplina
 */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
//______________________________métodos_______________________________
/**
 *cadastra as horas de estudo do aluno 
 * @param horas
 */
	
	public void cadastraHoras(int horas) {
		this.horasEstudo = horas;
	}
/**
 *cadastra as notas dos alunos, noo primeiro parametro qual a nota e no segundo o resultado. 
 * @param nota
 * @param valorNota
 */

	public void cadastraNota(int nota, double valorNota) {
		if (nota==1) {
			this.nota1 = valorNota;
		}else if(nota==2) {
			this.nota2 = valorNota;
		}else if(nota==3) {
			this.nota3 = valorNota;
		}else {
			this.nota4 = valorNota;
		}
	}
/**
 *analisa se o aluno foi aprovado ou não pela média 	
 * @return um valor booleando, sim se a media for maior ou igual a 7 e não caso seja menor que 7
 */
	public boolean aprovado() {
		if (((nota1+nota2+nota3+nota4)/4)>=7) {
			return true;
		}else {
			return false;
		}
	}

/**
 * o toString deve gerar uma representação da disciplina que contenha o nome da 
 * disciplina, o número de horas de estudo, a média do aluno e as notas de cada prova.

 */
	public String toString( ) {
		return nomeDisciplina+" "+horasEstudo+" "+(nota1+nota2+nota3+nota4)/4+" "+"["+nota1+", "+nota2+", "+nota3+", "+nota4+"]";
	}

}
