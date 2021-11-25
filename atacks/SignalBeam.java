package atacks;

import ru.ifmo.se.pokemon.*;

public class SignalBeam extends SpecialMove {
    public SignalBeam(){
        super(Type.BUG, 75, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pok){
        if (Math.random() < 0.1){
            pok.setMod(Stat.HP, -3);
            Effect.confuse(pok);
        }
    }
    @Override
    protected String describe(){
        return"использует SignalBeam";
    }
}
