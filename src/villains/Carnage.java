package villains;
import abstractions.Villain;
import interfaces.CanBlendIn;
import interfaces.FormScheme;

public class Carnage extends Villain implements FormScheme, CanBlendIn
{
	
	public Carnage(String n, String p)
	{
		super(n, p);
	}
	
	@Override
	public String doEvilDeed() {
		return "Murder";
	}

	@Override
	public String nemesisOf() {
		return "Spider-Man";
	}
	
	@Override
	public String blendIn() {
		return "Recalls carnage";
	}

	@Override
	public String makePlan() {
		return "Find person, kill person";
	}

}
