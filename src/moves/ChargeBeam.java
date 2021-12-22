package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends SpecialMove {
    int spec_attack = 0;
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            if (spec_attack < 6) {
                p.setMod(Stat.ATTACK, +1);
                spec_attack++;
            }
        }
    }

    @Override
    protected String describe() {
        return "наност урон и повышает спец атаку (Charge Beam)";
    }
}
