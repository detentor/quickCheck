package com.github.detentor.quickcheck.core;

import java.util.List;

/**
 * Tipos são conjuntos cujos elementos são os valores que eles podem assumir. 
 * Ex: Boolean é um conjunto de dois elementos: {true, false} <br/>
 * Embora um teste perfeito seria aquele que testaria todos os dados de entrada, isso é impraticável. <br/>
 * Na prática, é suficiente testar os "casos de borda". 
 * Ex: Para Integer, seria Integer.MIN_VALUE, Integer.MAX_VALUE, 0 e 1.
 * Como regra geral, pegam-se: o valor inferior, o valor superior, o elemento neutro e o elemento identidade (se existir).
 * Para listas, por exemplo, é suficiente prover uma lista com zero elementos e uma lista com um elemento.
 * 
 * <br/><br/>
 * O objetivo dessa interface é prover essa lista de valores, de forma que seja possível fazer um teste
 * mais eficiente. 
 * 
 * OBS: Não é necessário prover o valor null, ele SEMPRE já será testado automaticamente.
 * 
 * @author Vinicius Seufitele
 *
 * @param <A> A classe que será "derivada"
 */
public interface Derivable<A>
{
	/**
	 * Retorna uma lista de valores do tipo A que devem, <b>obrigatoriamente</b>, ser testados. <br/>
	 * Ex: Para String, seria Strings vazias e Strings com 1 caracter. <br/>
	 *     Para Integer, seria Integer.MIN_VALUE, 0, 1 e Integer.MAX_VALUE
	 *       
	 * 
	 * @return Uma lista de valores
	 */
	List<A> getValues();
	
	/**
	 * Retorna uma instância com valor interno (potencialmente) aleatório, para prover verificações além das 
	 * triviais. <br/>
	 * @return
	 */
	A newInstance();

}
