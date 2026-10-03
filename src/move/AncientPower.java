package move;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    public AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    private boolean statsFlag = false;

    @Override
    protected void applySelfEffects(Pokemon p) {
        int chance = (int) (Math.random() * 101);
        if (chance <= 10) {
            statsFlag = true;
            p.setMod(Stat.ATTACK, 1);
            p.setMod(Stat.DEFENSE, 1);
            p.setMod(Stat.SPECIAL_ATTACK, 1);
            p.setMod(Stat.SPECIAL_DEFENSE, 1);
            p.setMod(Stat.SPEED, 1);
        }
    }

    @Override
    protected String describe() {
        if (statsFlag) {
            return "использует Ancient Power и повышает ВСЕ характеристики на 1 ступень";
        }
        return "использует атаку Ancient Power, нанося урон";
    }
}
