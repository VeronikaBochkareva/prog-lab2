package move;

import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {
    public DracoMeteor() {
        super(Type.DRAGON, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "использует Draco Meteor, наносит урон 130 с точностью 0.9 и теряет 2 от Special Attack";
    }
}