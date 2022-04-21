package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Displayable;
import interfaces.Quotable;

public class StarLord extends Hero implements Displayable, Quotable
{
    public StarLord()
    {
	super("Star-Lord", "Legendary Outlaw");
    }
      
    public String useQuadBlaster()
    {
	return "fires quad blaster!";
    }

    @Override
    public ArrayList<String> getSpecialAbilities()
    {
	/* 
	 * According to:
	 * https://www.marvel.com/characters/star-lord-peter-quill/in-comics
	*/
	ArrayList<String> abilities = new ArrayList<String>();
	abilities.add("Survive in space");
	abilities.add("Fly faster than the speed of light");
	abilities.add("Generate a personal force field");
	abilities.add("Fast recovery from injuries");
	abilities.add("Super human strength");
	abilities.add("Universal language translation");
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
    public String getQuote()
    {
	return "I come from Earth, a planet of outlaws: Billie the Kid, Bonnie and Clyde, John Stamos.";
    }

    @Override
    public String getImageFileName()
    {
	return "starlord.jpg";
    }   
    
}
