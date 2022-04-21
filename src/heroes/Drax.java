package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Displayable;
import interfaces.Quotable;

public class Drax extends Hero implements Displayable, Quotable
{
    public Drax()
    {
	super("Drax", "Destroys Things");
    }

    @Override
    public ArrayList<String> getSpecialAbilities()
    {
	ArrayList<String> abilities = new ArrayList<String>();
	abilities.add("Brute force");
	return abilities;
    }

    @Override
    public String getCostume() {
        return "himself";
    }

    @Override
    public String getHomeWorld() {
        return "Kylos";
    }

    @Override
    public String getImageFileName()
    {
	return "drax.jpg";
    }
    
    public String getQuote()
    {
    	return "Nothing goes over my head.";
    }

}
