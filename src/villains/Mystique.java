package villains;

import abstractions.Villain;
import interfaces.CanBlendIn;

public class Mystique extends Villain implements CanBlendIn {

	public Mystique(String n, String p) {
		super(n, p);
	}

	@Override
	public String doEvilDeed() {
		return "infiltrates an army base and steals technology";
	}

	@Override
	public String nemesisOf() {
		return "The X-Men";
	}

	@Override
	public String blendIn() {
		return "disguises herself as a civilian and blends into a crowd";
	}

}
