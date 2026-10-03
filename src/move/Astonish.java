package move;

import ru.ifmo.se.pokemon.*;

public class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }

    private boolean flinchFlag = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        int chance = (int) (Math.random() * 101);
        if (chance <= 30) {
            flinchFlag = true;
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        if (flinchFlag) {
            return "использует атаку Astonish и заставляет соперника вздрогнуть от испуга";
        }
        return "использует атаку Astonish, нанося физический урон";
    }
}
