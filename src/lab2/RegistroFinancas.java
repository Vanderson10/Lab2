package lab2;

import java.util.Arrays;

/**
 * Cadastro das finanças de um aluno para organizar os seus gastos durante o curso
 * @author vanderson
 *
 */

public class RegistroFinancas {

/**
 *Atributos com os ganhos e despesas do aluno 	
 */
	private int ganhos=0;
	private int despesas=0;
	
/**
 *quantos ganhos o aluno vai receber 
 */
	private int quantosGanhos;

/**
 * array para armazenar cada ganho em cada posição definida
 */
	int[] posicoes;

//________________________contrutor_________________________________
/**
 *construtor que recebe como parametro a quantidade de ganhos de um individuo para 
 *cada posição que seria o total de ganhos 
 * @param ganhosIniciais
 * @param totalDeGanhos
 */
	public RegistroFinancas(int ganhosIniciais, int totalDeGanhos) {
		this.ganhos = ganhosIniciais;
		this.quantosGanhos = totalDeGanhos;
		posicoes = new int[totalDeGanhos];
	}
	
//__________________________metodos________________________	
/**
 *adiciona os ganhos a cada posição indicada no array 
 *soma cada ganho ao total de ganhos
 *caso a nota seja alterada, o valor somado ao ganho anterioromente será diminuido e somado o novo valor
 * @param valorCentavos
 * @param posicaoGanho
	 */
	public void adicionaGanhos(int valorCentavos, int posicaoGanho) {
		if (posicoes[posicaoGanho-1]!=0) {
			this.ganhos -= posicoes[posicaoGanho-1];
		}
		posicoes[posicaoGanho-1] = valorCentavos;
		this.ganhos +=valorCentavos;
		
	}
	
/**
 *acessa e incrementa os valores da despesa 
 * @param valorCentavos
 */
	public void pagaDespesa(int valorCentavos) {
		this.despesas += valorCentavos;
		
	}
	
/**
 *imprime cada posição do array e o ganho que foi realizado em cada posição 
 * @return a saida resultante da soma entre o indice do array, o espeço e o valor dentro do array convertido em string.
 */
	public String exibeGanhos( ) {
		String saida = "";
		for (int i=0; i<posicoes.length; i++) {
			String index = String.valueOf(i+1);
			String valor = String.valueOf(posicoes[i]);
			if(Integer.parseInt(index)==posicoes.length) {
				saida += index+" - "+valor;
			}else {
				saida += index+" - "+valor+"\n";
			}
		}
		return saida;
	}
	
/**
 * o toString deve gerar uma representação do saldo do aluno
 * @return o valor total que foi ganho, as despesas e o saldo que restou. 
 */
	public String toString( ) {
		return "Total recebidos: "+this.ganhos+", Despesas totais: "+this.despesas+", Total disponível: "+(this.ganhos-this.despesas);

	}

	

}
