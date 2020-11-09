import ru.ifmo.se.pokemon.*;
class CosmicPower extends SpecialMove {
    protected CosmicPower() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected String describe(){
        return "Использует  Cosmic Power";

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE, +1);
        p.setMod(Stat.DEFENSE, +1);
    }
}
