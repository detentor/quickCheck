package com.github.detentor.quickcheck.derivable;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.github.detentor.quickcheck.core.Derivable;

public class DerivableBool implements Derivable<Boolean>
{
	@Override
	public List<Boolean> getValues()
	{
		return Arrays.asList(true, false);
	}

	@Override
	public Boolean newInstance()
	{
		return new Random().nextBoolean();
	}
}
