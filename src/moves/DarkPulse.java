package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            p.confuse();
        }
    }

    @Override
    protected String describe() {
        return "наносит урон и заставляет вздрогнуть (Dark Pulse)";
    }
}
