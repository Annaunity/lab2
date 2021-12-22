package pokemons;

import moves.Confide;
import moves.DarkPulse;
import ru.ifmo.se.pokemon.Pokemon;

public class Rowlet extends Pokemon {
    public Rowlet(String name, int level) {
        super(name, level);
        setStats(68,55,55,50,50,42);
        setMove(new DarkPulse(),new Confide());
    }
}
