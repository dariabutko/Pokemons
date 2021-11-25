package atacks;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.3) {
            pok.setMod(Stat.HP, +2);
        }
    }
    @Override
    protected String describe(){
        return"использует DreamEater";
    }
}
