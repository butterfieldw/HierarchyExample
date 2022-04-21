package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Displayable;
import interfaces.Quotable;

public class Rocket extends Hero implements Displayable, Quotable
{
    public Rocket()
    {
	super("Rocket", "Advanced Tactician");
    }

    @Override
    public ArrayList<String> getSpecialAbilities()
    {
	/* 
	 * According to:
	 * https://marvel.fandom.com/wiki/Rocket_Raccoon_(Earth-616)?scrlybrkr=83ff43e3#Abilities
	*/
	ArrayList<String> abilities = new ArrayList<String>();
	abilities.add("Expert marksman");
	abilities.add("Skilled combatant");
	abilities.add("Accomplished tactician and strategist");
	abilities.add("Pilot");
	abilities.add("Demolitions expert");
	return abilities;
    }

	@Override
	public String getCostume() {
		return null;
	}

	@Override
	public String getHomeWorld() {
		return null;
	}

	@Override
    public String getImageFileName()
    {
	return "rocket.jpg";
    }

	@Override
	public String getQuote() {
		return "Ain’t nothin’ like me, 'cept me.";
	}
}
