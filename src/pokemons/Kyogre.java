package pokemons;

import moves.Ember;
import moves.FeintAttack;
import moves.FireBlast;
import moves.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;

public class Kyogre extends Pokemon {
    public Kyogre(String name, int level) {
        super(name, level);
        setStats(100, 100, 90, 150, 140, 90);
        setMove(new FeintAttack(), new ShadowBall(), new FireBlast(), new Ember());
    }
}
