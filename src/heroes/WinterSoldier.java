package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class WinterSoldier extends Hero implements Flying, ProjectileThrower
{
    public WinterSoldier(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getHomeWorld() {
        return "Back to Queens";
    }

    @Override
    public String getCostume() {
        return "Put on arm";
    }

    @Override
    public String fly() {
        return "does not fly";
    }

    @Override
    public String throwProjectile() {
        return "shoot gun";
    }
}
