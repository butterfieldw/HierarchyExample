package abstractions;

public abstract class MarvelCharacter
{
    private String name;
    private String superPower;
    
    public MarvelCharacter(String n, String p)
    {
	name = n;
	superPower = p;
    }
    
    public String getName()
    {
	return name;
    }
    
    public String getSuperPower()
    {
	return superPower;
    }
}
