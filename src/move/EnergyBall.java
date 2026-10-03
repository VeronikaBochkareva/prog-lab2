package move;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
    public EnergyBall() {
        super(Type.GRASS, 90, 10);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        int chance = (int) (Math.random() * 101);
        if (chance <= 10) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использует Energy Ball, пытаясь понизить Special Defense";
    }
}