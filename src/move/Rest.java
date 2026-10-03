package move;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.addEffect(e);

        int maxHP = (int) pokemon.getStat(Stat.HP);
        int currentHP = (int) pokemon.getHP();
        int hpToRestore = maxHP - currentHP;

        pokemon.setMod(Stat.HP, hpToRestore);
    }

    @Override
    protected String describe() {
        return "использует Rest, спит 2 раунда и полностью излечивается";
    }
}