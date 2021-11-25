package atacks;

import ru.ifmo.se.pokemon.*;

public class CosmicPower extends StatusMove {
    public CosmicPower() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon pok){
        pok.setMod(Stat.DEFENSE, +1);
        pok.setMod(Stat.SPECIAL_DEFENSE, +1);
    }
    @Override
    protected String describe(){
        return"использует CosmicPower";
    }
}
