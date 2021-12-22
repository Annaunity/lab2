package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Scald extends StatusMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3)
            Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "атакует и поджигает (Scald)";
    }
}
