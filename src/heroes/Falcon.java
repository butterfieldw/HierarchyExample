package heroes;
import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class Falcon extends Hero implements Flying, ProjectileThrower {

    public Falcon(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getCostume() {
        return "Wings and a suit";
    }

    @Override
    public String getHomeWorld() {
        return "Earth";
    }

    @Override
    public String fly() {
        return "Uses makeshift wings to fly";
    }

    @Override
    public String throwProjectile() {
        return "He got a lil gun";
    }
}
