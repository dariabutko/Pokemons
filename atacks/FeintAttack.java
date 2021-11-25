package atacks;

import ru.ifmo.se.pokemon.*;

public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        super(Type.DARK, 60, 999999999);
    }
    @Override
    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.ACCURACY, -(int)(pok.getStat(Stat.ACCURACY)));
        pok.setMod(Stat.EVASION, -(int)(pok.getStat(Stat.EVASION)));
    }
}