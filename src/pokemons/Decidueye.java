package pokemons;

import moves.Confide;
import moves.DarkPulse;
import moves.HealPulse;
import moves.Swagger;

public class Decidueye extends Dartrix {
    public Decidueye(String name, int level) {
        super(name,level);
        setStats(78,107,75,100,100,70);
        setMove(new DarkPulse(), new Confide(),  new Swagger(), new HealPulse());
    }
}
