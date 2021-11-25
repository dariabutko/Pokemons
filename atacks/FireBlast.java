package atacks;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE, 110, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon pok){
        if (Math.random() < 0.1){
            pok.setMod(Stat.HP, -2);
            Effect.burn(pok);
        }
    }
    protected String describing(){
        return "использует FireBlast";
    }
}
