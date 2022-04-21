package villains;
import abstractions.Villain;
import interfaces.CanBlendIn;
import interfaces.FormScheme;

public class Sandman extends Villain implements FormScheme, CanBlendIn
{
	
	public Sandman(String n, String p)
	{
		super(n, p);
	}

	public String doEvilDeed() {
		return "Rob armored truck";
	}

	public String nemesisOf() {
		return "Spider-Man";
	}

	public String blendIn() {
		return "Stops being sand";
		}

	public String makePlan() {
		return "Find a truck, rob it";
	}

}
