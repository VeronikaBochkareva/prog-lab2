package pokemon;

import move.*;
import ru.ifmo.se.pokemon.*;

public class Pumpkaboo extends Pokemon {
    public Pumpkaboo(String name, int level) {
        super(name, level);

        this.setType(Type.GHOST, Type.GRASS);
        this.setStats(49, 66, 70, 44, 55, 51);
        this.addMove(new DoubleTeam());
        this.addMove(new Astonish());
        this.addMove(new EnergyBall());
    }

}