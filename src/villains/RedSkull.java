package villains;

import abstractions.Villain;
import interfaces.FormScheme;

public class RedSkull extends Villain implements FormScheme {

	public RedSkull(String n, String p) {
		super(n, p);
	}

	@Override
	public String doEvilDeed() {
		return " attempts to harness the power of the Tesseract";
	}

	@Override
	public String nemesisOf() {
		return "Captain America";
	}

	@Override
	public String makePlan() {
		return "plans to use the power of the space stone to conquer the world, sets traps for Captain America";
	}

}
