package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Palkia extends Pokemon {
    public Palkia(String name, int level) {
        super(name, level);
        this.setStats(90, 120, 100, 150, 120, 100);
        this.setType(Type.WATER, Type.DRAGON);

        this.addMove(new DoubleTeam());
        this.addMove(new Rest());
        this.addMove(new DracoMeteor());
        this.addMove(new AncientPower());
    }
}