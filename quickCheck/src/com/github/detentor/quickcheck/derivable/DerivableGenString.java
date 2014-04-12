package com.github.detentor.quickcheck.derivable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.github.detentor.quickcheck.core.Derivable;

/**
 * Classe básica que provê a classe de valores básica para um teste de Strings. <br/>
 * Note que o newInstance retornará uma String com conteúdo aleatório. <br/>
 * Classes que precisarem de Strings que sigam um padrão devem criar suas próprias classes derivable.
 * 
 * @author Vinicius Seufitele
 *
 */
public class DerivableGenString implements Derivable<String>
{
	@Override
	public List<String> getValues()
	{
		return Arrays.asList("");
	}

	/**
	 * Gera uma nova instância de uma String genérica. O conteúdo da String pode ter qualquer tipo de caracter (imprimível).
	 */
	@Override
	public String newInstance()
	{
		final int offSet = 32;
		final int highValue = 128;
		final int max_Size = 1200;
		
		final Random random = new Random();
		final int finalSize = random.nextInt(max_Size);
		final char[] theStr = new char[finalSize];
		
		for (int i = 0; i < finalSize; i++)
		{
			theStr[i] = (char)((random.nextInt(highValue-offSet)) + offSet);
		}
		return String.valueOf(theStr) ;
	}
}
