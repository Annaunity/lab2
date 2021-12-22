package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60, Double.POSITIVE_INFINITY );
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        super.applySelfDamage(p, damage);
    }

    @Override
    protected String describe() {
        return "наносит урон (FeintAttack)";
    }
}

