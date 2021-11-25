package pokemons;
import atacks.*;
import ru.ifmo.se.pokemon.*;

public class Turtwig extends Pokemon {
    public Turtwig(String name, int level){
        super(name, level);
        setStats(55, 68, 64, 45, 55, 31);
        setType(Type.GRASS);
        setMove(new Swagger(), new DoubleTeam());
    }
}
