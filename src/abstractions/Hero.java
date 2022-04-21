package abstractions;

import java.util.ArrayList;

import heroes.*;

public abstract class Hero extends MarvelCharacter
{
    public Hero(String n, String p)
    {
	super(n, p);
    }

    // Each subclass will define a different list of special abilities
    public abstract ArrayList<String> getSpecialAbilities();
    
    // Tests if both mc and other are members of the Guardians of the Galaxy
    public static boolean areTeammates(MarvelCharacter mc, MarvelCharacter other)
    {
	return isGuardianOfTheGalaxy(mc) && isGuardianOfTheGalaxy(other);
    }

    // Produces a string of the name and superpower of the Hero 
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Classification: HERO!\n\n");
	    sb.append("Name: " + getName() + "\n");
	    sb.append("Superpower: " + getSuperPower() + "\n");
	    sb.append("Costume: " + getCostume() + "\n");
	    sb.append("Home world: " + getHomeWorld() + "\n");

        ArrayList<String> abilities = getSpecialAbilities();
        if (abilities.size() > 0) {
            sb.append("Special Abilities:\n");
            for(int i = 0; i < abilities.size(); i++)
            {
                sb.append((i+1) + ". " + abilities.get(i) + "\n");
            }
        }
        return sb.toString();
    }

    // Helper method
    private static boolean isGuardianOfTheGalaxy(MarvelCharacter mc)
    {
		return mc instanceof StarLord 	||
		       mc instanceof Rocket 	||
		       mc instanceof Groot 	||
		       mc instanceof Drax 	||
		       mc instanceof Gamora;
    }

    public abstract String getCostume();
    public abstract String getHomeWorld();

}
