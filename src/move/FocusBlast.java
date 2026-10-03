package move;

import ru.ifmo.se.pokemon.*;
public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
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
        return "использует Focus Blast, пытаясь понизить Special Defense";
    }
}