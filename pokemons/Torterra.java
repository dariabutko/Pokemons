package pokemons;
import atacks.*;
import ru.ifmo.se.pokemon.*;

public class Torterra extends Pokemon {
    public Torterra(String name, int level){
        super(name, level);
        setStats(95, 109, 105, 75, 85, 56);
        setType(Type.GRASS, Type.GROUND);
        setMove(new Swagger(), new DoubleTeam(), new SignalBeam(), new Hypnosis());
    }
}
