package pokemons;

import moves.Blizzard;
import moves.ChargeBeam;
import moves.IceBeam;
import ru.ifmo.se.pokemon.Pokemon;

public class Stunky extends Pokemon {
    public Stunky(String name, int level) {
        super(name, level);
        setStats(63, 63, 47, 41, 41, 74);
        setMove(new IceBeam(), new Blizzard(), new ChargeBeam());
    }
}
