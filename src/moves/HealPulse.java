package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class HealPulse extends PhysicalMove {
    int hprestore = 0;
    double random = Math.random();
    public HealPulse() {
        super(Type.PSYCHIC, 0 ,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (random <= 0.5) {
            hprestore = ((int) random) * 10;
            p.setMod(Stat.HP, -hprestore);
        }
    }

    @Override
    protected String describe() {
        return "восстановляет половину HP (HealPulse)";
    }

}
