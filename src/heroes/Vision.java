package heroes;

import java.util.ArrayList;
import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class Vision extends Hero implements ProjectileThrower, Flying{

    public Vision(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getCostume() {
        return "Red/blue metal";
    }

    @Override
    public String getHomeWorld() {
        return "Earth";
    }

    @Override
    public String fly() {
        return "How does he fly? He just does";
    }

    @Override
    public String throwProjectile() {
        return "Laser beam";
    }
}
