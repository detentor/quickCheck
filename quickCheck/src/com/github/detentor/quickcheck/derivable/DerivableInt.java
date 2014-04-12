package com.github.detentor.quickcheck.derivable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.github.detentor.quickcheck.core.Derivable;

/**
 * Classe básica que provê a classe de valores básica para um teste de inteiros
 * 
 * @author Vinicius Seufitele
 *
 */
public class DerivableInt implements Derivable<Integer>
{
	@Override
	public List<Integer> getValues()
	{
		return Arrays.asList(Integer.MIN_VALUE, 0, 1,  Integer.MAX_VALUE);
	}

	@Override
	public Integer newInstance()
	{
		return new Random().nextInt();
	}
}
