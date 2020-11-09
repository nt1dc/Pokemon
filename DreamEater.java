import ru.ifmo.se.pokemon.*;
class DreamEater extends PhysicalMove{
    protected DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected String describe(){
        return "Использует Dream Eater";

    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status PokCon = def.getCondition();
        if (PokCon.equals(Status.SLEEP)){
            def.setMod(Stat.HP, (int) Math.round(damage));
        }
    }
}
