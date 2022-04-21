package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Displayable;
import interfaces.Quotable;

public class Groot extends Hero implements Displayable, Quotable
{
    public Groot()
    {
	super("Groot", "Vegetation Power");
    }

    @Override
    public ArrayList<String> getSpecialAbilities()
    {
	ArrayList<String> abilities = new ArrayList<String>();
	abilities.add("Grows like crazy.");
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
	return "groot.jpg";
    }

    @Override
    public String getQuote() {
        return "I am groot.";
    }
}
