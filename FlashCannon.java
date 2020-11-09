import ru.ifmo.se.pokemon.*;
class FlashCannon extends SpecialMove{
    protected  FlashCannon() {
        super(Type.STEEL,80,100);
    }
    @Override
    protected String describe(){
        return "Использует Flash Cannon";

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <=0.1) p.setMod(Stat.SPECIAL_DEFENSE, -1);

    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));

    }
}