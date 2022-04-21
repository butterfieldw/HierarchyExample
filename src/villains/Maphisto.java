package villains;

import abstractions.Villain;
import interfaces.FormScheme;

public class Maphisto extends Villain implements FormScheme
{
	public Maphisto(String n, String p) {
		super(n, p);
	}

	@Override
	public String doEvilDeed()
	{
		return "Tricks and manipulates people";
	}

	@Override
	public String nemesisOf() {
		return "Silver Surfer, Fantastic Four, Dr. Strange, Spider-Man, and Ghost-Rider.";
	}

	@Override
	public String makePlan()
	{
		return "He manipulates poeple into doing what he wants.";
	}
	
	public String madeOfFire()
	{
		return "He is the divel of course he is really hot";
	}
	
	public String  makeMinions()
	{
		return "He makes them, uses them, and gets them to make other do things for him";
	}

}
