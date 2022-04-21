package villains;

import abstractions.Villain;
import interfaces.CanBlendIn;

public class Rhino extends Villain implements CanBlendIn
{
	public Rhino(String n, String p)
	{
		super(n, p);
	}

	@Override
	public String blendIn()
	{
		return "Is a regular human male in a rino suit.";
	}

	@Override
	public String doEvilDeed()
	{
		return "Loves ramming his head into things to destroy them.";
	}

	@Override
	public String nemesisOf() {
		return "Spider-Man";
	}
	
	public String RideSuit()
	{
		return "Has a suit shaped like a Rino";
	}
	
	public String superSences()
	{
		return "He can Smell really well...";
	}



}
