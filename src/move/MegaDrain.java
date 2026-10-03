package move;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain() {
        super(Type.GRASS, 40.0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, 10);
    }

    @Override
    protected String describe() {
        return "применяет Mega Drain, нанося урон и восстанавливая свои силы";
    }
}
