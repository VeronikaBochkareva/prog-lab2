package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;
public final class Bellossom extends Gloom {
    public Bellossom(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS);

        this.setStats(75, 80, 95, 90, 100, 50);

        this.addMove(new QuiverDance());
    }
}
