package atacks;

import ru.ifmo.se.pokemon.*;
public class TailWhip extends StatusMove {
    public TailWhip(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pok){
        pok.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "использует TailWhip";
    }
}
