package abstractions;

public abstract class Villain extends MarvelCharacter
{

    public Villain(String n, String p)
    {
	super(n, p);
    }

    public abstract String doEvilDeed();

    public abstract String nemesisOf();

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Classification: VILLAIN!\n\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Superpower: " + getSuperPower() + "\n");
        sb.append("Evil Deed: " + doEvilDeed() + "\n");
        sb.append("Nemesis of: " + nemesisOf() + "\n");
        return  sb.toString();
    }
}
