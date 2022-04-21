package abstractions;

public abstract class Villain extends MarvelCharacter
{

    public Villain(String n, String p)
    {
	super(n, p);
    }

    public abstract String doEvilDeed();

    public abstract String nemesisOf();
}
