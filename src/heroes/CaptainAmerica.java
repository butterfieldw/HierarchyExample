package heroes;
import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class CaptainAmerica extends Hero implements ProjectileThrower, Flying {
    public CaptainAmerica(String n, String p)
    {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getCostume()
    {
        return "Equips shield";
    }
    @Override
    public String getHomeWorld()
    {
        return "Earth";
    }

    @Override
    public String fly() {
        return "no";
    }

    @Override
    public String throwProjectile() {
        return "Throws Shield";
    }
}