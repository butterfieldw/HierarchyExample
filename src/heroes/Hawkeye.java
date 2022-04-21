package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.ProjectileThrower;

public class Hawkeye extends Hero implements ProjectileThrower
{
	public Hawkeye(String n, String p) {
		super(n, p);
	}

	@Override
	public ArrayList<String> getSpecialAbilities() {
		ArrayList<String> abilitites = new ArrayList<String>();
		return abilitites;
	}

	@Override
	public String getCostume() {
		return "Equips bow and quiver";
	}

	@Override
	public String getHomeWorld() {
		return "returned to ranch on Earth";
	}

	@Override
	public String throwProjectile() {
		return "Shoots arrow";
	}
}
