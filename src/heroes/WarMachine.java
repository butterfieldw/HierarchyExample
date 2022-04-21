package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class WarMachine extends Hero implements Flying, ProjectileThrower
{

	public WarMachine(String n, String p) {
		super(n, p);
	}

	@Override
	public ArrayList<String> getSpecialAbilities() {
		ArrayList<String> abilitites = new ArrayList<String>();
		return abilitites;
	}

	@Override
	public String getCostume() {
		return "Presses button on suitcase";
	}

	@Override
	public String getHomeWorld() {
		return "Returns to military base on Earth";
	}
	
	public String fly()
	{
		return "Activates propulsion";
	}

	@Override
	public String throwProjectile() {
		return "Shoots mounted LMG";
	}
}
