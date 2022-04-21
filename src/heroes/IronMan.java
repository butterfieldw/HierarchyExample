package heroes;
import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class IronMan extends Hero implements ProjectileThrower, Flying {
    public IronMan(String n, String p)
    {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getCostume() {
        return "Equips iron man suit";
    }
    @Override
    public String getHomeWorld()
    {
        return "Return to New York";
    }
    @Override
    public String fly() {
        return "Flys using jet boots and repulsor rays";
    }
    @Override
    public String throwProjectile() {
        return "Shoots using weapons from his suit";
    }
}
