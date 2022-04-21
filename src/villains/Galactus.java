package villains;

import abstractions.Villain;
import interfaces.FormScheme;

public class Galactus extends Villain implements FormScheme
{
	public Galactus(String n, String p) 
	{
		super(n, p);
	}

	@Override
	public String doEvilDeed()
	{
		return "He is big hungry and he eat your planet!";
	}

	@Override
	public String nemesisOf() {
		return "Tyrant";
	}

	@Override
	public String makePlan()
	{
		return " He looks for planet, he finds planet, he eats planet, very complicated";
	}
	
	public boolean hungerLevel()
	{
		int r = (int)(Math.random() * 2);
		return r == 0;
	}

	public boolean canGrow()
	{
		int r = (int)(Math.random() * 10);
		return r == 0;
	}

}
