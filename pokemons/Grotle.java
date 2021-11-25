package pokemons;
import atacks.*;
import ru.ifmo.se.pokemon.*;

public class Grotle extends Pokemon {
    public Grotle(String name, int level){
        super (name, level);
        setStats(75, 89, 85, 55, 65, 36);
        setType(Type.GRASS);
        setMove(new Swagger(), new DoubleTeam(), new SignalBeam());
    }
}
