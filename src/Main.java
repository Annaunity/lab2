import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Dartrix p1 = new Dartrix("1", 1);
        Decidueye p2 = new Decidueye("2", 1);
        Kyogre p3 = new Kyogre("3", 1);
        Rowlet p4 = new Rowlet("4", 1);
        Skuntank p5 = new Skuntank("5", 1);
        Stunky p6 = new Stunky("6", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.go();
    }
}
