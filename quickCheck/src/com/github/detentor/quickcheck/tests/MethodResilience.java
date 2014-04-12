package com.github.detentor.quickcheck.tests;

/**
 * Essa classe verificará métodos para os seguintes casos:
 * 
 * Um método ideal deveria apenas agir sobre seus parâmetros, e retornar algum valor. <br/>
 * Um método que modifica qualquer de seus parâmetros de entrada facilita o aparecimento de erros,
 * pois o caller do método precisa saber que o método irá ter esse efeito. 
 *   * 
 *  1) O método produz efeitos colaterais?
 *   	Efeitos colaterais são alterações indesejadas de uma estrutura de um objeto ou de um de seus parâmetros.
 *   	Ex: int square(int x){
 *   		x = x * x;
 *   		return x;
 *   	}
 *   	Observe, nesse exemplo, que o valor de x passado como parâmetro foi modificado pelo método. <br/>
 *   	Esse tipo de comportamento é desaconselhável.
 *   	OBS: Todos os métodos void produzem efeito colateral, afinal são chamados apenas pelo seu efeito.
 *  
 *  1) O método é 'puro' ?
 *  	Um método é considerado puro quando, para os mesmos dados de entrada, ele produz a mesma saída.
 *  
 * 
 * @author Vinicius Seufitele
 *
 */
public class MethodResilience
{

}
