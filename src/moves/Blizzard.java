package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard  extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            if (!p.hasType(Type.ICE)) {
                Effect.freeze(p);
            }
        }
    }
    @Override
    protected String describe() {
        return "атакует и замораживает (Blizzard)";
    }

}
