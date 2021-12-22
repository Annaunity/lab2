package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() < 0.2) {
        p.setMod(Stat.DEFENSE, -1);
            super.applySelfEffects(p);
        }
    }

    @Override
    protected String describe() {
        return "атакует и понижает спец защиту(Shadow Ball)";
    }
}
