package heroes;
import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class SpiderMan extends Hero implements ProjectileThrower, Flying {
    public SpiderMan(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    public String getQuote() {
        return "Hi I'm Peter Parker";
    }

    @Override
    public String getCostume() {
        return null;
    }

    @Override
    public String getHomeWorld() {
        return "Return to Queens, New York";
    }

    @Override
    public String fly() {
        return "Swings with spider webs";
    }

    @Override
    public String throwProjectile() {
        return "Shoots spider webs";
    }
}