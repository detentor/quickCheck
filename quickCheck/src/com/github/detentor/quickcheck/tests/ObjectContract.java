package com.github.detentor.quickcheck.tests;

/**
 * Essa classe verifica se o objeto testado está conforme o contrato esperado de objetos. <br/>
 * A princípio será verificado: <br/><br/>
 * 
 * 1) O equals do objeto segue o contrato do equals?
 * 		a) Reflexiva: x.equals(x) == true
 * 		b) Simétrica: x.equals(y) == y.equals(x)
 * 		c) Transitiva: x.equals(y) && y.equals(z) == x.equals(z)
 * 
 * 2) O objeto é consistente? 
 * 		a) x.getClass.newInstance().equals(x.getClass.newInstance())
 *   	OBS: Note que consistência não é obrigatória (classes new Date() por exemplo são diferentes), 
 *   	então será emitido um warning quando não houver consistência. Em geral, classes devem ser consistentes.
 * 
 * 3) Contrato do hashCode:
 *  		x.equals(y) == (x.hashCode == y.hashCode) 
 * 
 * @author Vinicius Seufitele
 *
 */
public class ObjectContract
{

}
