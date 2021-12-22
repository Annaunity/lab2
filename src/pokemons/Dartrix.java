package pokemons;

import moves.Confide;
import moves.DarkPulse;
import moves.HealPulse;

public class Dartrix extends Rowlet {
    public Dartrix(String name, int level) {
        super(name, level);
        setStats(78,75,75,70,70,52);
        setMove(new DarkPulse(), new Confide(), new HealPulse());
    }

}
