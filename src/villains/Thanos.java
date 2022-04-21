package villains;

import abstractions.Villain;

public class Thanos extends Villain
{

    public Thanos()
    {
	super("Thanos", "Titan Strength and Stamina");
    }

    @Override
    public String doEvilDeed() {
        return "Finger snap";
    }

    @Override
    public String nemesisOf() {
        return "All heroes";
    }
}
