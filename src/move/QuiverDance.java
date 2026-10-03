package move;

import ru.ifmo.se.pokemon.*;

public class QuiverDance extends StatusMove {
    public QuiverDance() {
        super(Type.BUG, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 1);
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "исполняет Quiver Dance, повышая свою Speed, Sp. Atk и Sp. Def на 1 ступень";
    }
}
