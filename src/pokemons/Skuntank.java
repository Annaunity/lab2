package pokemons;

import moves.Blizzard;
import moves.ChargeBeam;
import moves.IceBeam;
import moves.Scald;

public class Skuntank extends Stunky{
    public Skuntank(String name, int level) {
        super(name, level);
        setStats(103, 93, 67, 71, 61, 84);
        setMove(new IceBeam(), new Blizzard(), new ChargeBeam(), new Scald());
    }
}
