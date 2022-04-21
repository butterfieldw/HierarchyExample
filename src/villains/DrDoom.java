package villains;
import abstractions.Villain;
import interfaces.FormScheme;

public class DrDoom extends Villain implements FormScheme
{
	
	public DrDoom(String n, String p)
	{
		super(n, p);
	}
	
	@Override
	public String doEvilDeed() {
		return "Build doomsday machine";
	}

	@Override
	public String nemesisOf() {
		return "Fantastic Four";
	}

	@Override
	public String makePlan() {
		return "Make a robot army to do his job for him";
	}

}
