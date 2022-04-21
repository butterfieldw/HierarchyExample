package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Displayable;
import interfaces.Quotable;

public class Gamora extends Hero implements Displayable, Quotable
{
    public Gamora()
    {
	super("Gamora", "Warrior");
    }

    @Override
    public ArrayList<String> getSpecialAbilities()
    {
	ArrayList<String> abilities = new ArrayList<String>();
	abilities.add("Fierce warrior");
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
	return "gamora.jpg";
    }
    
    public String getQuote()
    {
    	return "I go by many names, Earthian, but I'm sure the one that most know me by is Gamora, the deadliest woman in the whole galaxy.";
    }

}
