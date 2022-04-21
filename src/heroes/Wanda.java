package heroes;

import java.util.ArrayList;
import abstractions.Hero;
import interfaces.Flying;

public class Wanda extends Hero implements Flying {

	public Wanda(String n, String p) {
		super(n, p);
	}

	@Override
	public ArrayList<String> getSpecialAbilities() {
		ArrayList<String> abilitites = new ArrayList<String>();
		return abilitites;
	}

	@Override
	public String fly()
	{
		return "Flies using her witch powers";
	}

	@Override
	public String getCostume() {
		return "Body Suit and cape and crown";
	}

	@Override
	public String getHomeWorld() {
		return "Earth";
	}

}
