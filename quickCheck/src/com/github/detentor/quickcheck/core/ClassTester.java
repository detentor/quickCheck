package com.github.detentor.quickcheck.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe é responsável por executar os testes pré-determinados.
 * 
 * @author Vinicius Seufitele
 *
 */
public class ClassTester
{
	//Os testes a serem executados
	final List<Class<?>> testSuite = new ArrayList<>();
	
	
	/**
	 * Cria uma nova classe teste de acordo com os parâmetros passados
	 * 
	 * @param testSuite A suíte de testes a serem executados por essa engine
	 */
	public ClassTester(List<Class<?>> testSuite)
	{
		super();
		this.testSuite.addAll(testSuite);
	}

	//	 * @param genSize 	O número de elementos a ser gerado a cada teste
	
	public Report doTest()
	{
		return null;
	}

}
