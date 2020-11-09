import ru.ifmo.se.pokemon.*;
class Psychic extends SpecialMove{
    protected Psychic(){
        super(Type.	PSYCHIC, 90, 100);
    }
    @Override
    protected String describe(){
        return "Использует Psychic";

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
