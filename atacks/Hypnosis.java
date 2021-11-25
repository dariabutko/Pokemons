package atacks;

import ru.ifmo.se.pokemon.*;

public class Hypnosis extends StatusMove {
    public Hypnosis(){
        super(Type.PSYCHIC, 0, 60);
    }
    @Override
    protected void applyOppEffects(Pokemon pok){
        pok.setMod(Stat.SPEED, -3);
        Effect.sleep(pok);
    }
    protected String describing(){
        return "использует Hypnosis";
    }
}
