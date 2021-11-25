package atacks;

import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applySelfEffects(Pokemon pok){
        pok.setMod(Stat.ATTACK, +2);
        Effect.confuse(pok);
    }
    @Override
    protected String describe(){
        return "использует Swagger";
    }
}