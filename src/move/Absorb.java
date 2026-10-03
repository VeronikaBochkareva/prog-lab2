package move;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, 5);
    }

    @Override
    protected String describe() {
        return "применяет атаку Absorb, нанося урон и поглощая 5 HP для восстановления сил";
    }
}
