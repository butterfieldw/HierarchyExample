package heroes;

import java.util.ArrayList;

import abstractions.Hero;
import interfaces.Flying;
import interfaces.ProjectileThrower;

public class DoctorStrange extends Hero implements Flying, ProjectileThrower {
    public DoctorStrange(String n, String p) {
        super(n, p);
    }

    @Override
    public ArrayList<String> getSpecialAbilities() {
        ArrayList<String> abilitites = new ArrayList<String>();
        return abilitites;
    }

    @Override
    public String getHomeWorld() {
        return "back to New York";
    }

    @Override
    public String getCostume() {
        return "Put on cape";
    }

    @Override
    public String fly() {
        return "Capes floats";
    }

    @Override
    public String throwProjectile() {
        return "magic rope";
    }
}