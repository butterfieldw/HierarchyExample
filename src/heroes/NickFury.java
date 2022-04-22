package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class NickFury extends Hero implements Flying, ProjectileThrower {
    public NickFury(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getHomeWorld() {
        return "return to new York";
    }

    @Override
    public String getCostume() {
        return "grab black suit";
    }

    @Override
    public String fly() {
        return "gets in jet";
    }

    @Override
    public String throwProjectile() {
        return "shoot gun";
    }
}
