package villains;

import abstractions.Villain;
import interfaces.CanBlendIn;

public class Electro extends Villain implements CanBlendIn {

	public Electro(String n, String p) {
		super(n, p);
	}

	@Override
	public String doEvilDeed() {
		return "steals the power from a New York City substation.";
	}

	@Override
	public String nemesisOf() {
		return "Spider-man";
	}

	@Override
	public String blendIn() {
		return "removes suit and blends into a crowd of people";
	}

}
