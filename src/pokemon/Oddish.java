package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.addMove(new MegaDrain());
        this.addMove(new Rest());
    }

}