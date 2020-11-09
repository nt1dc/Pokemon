import ru.ifmo.se.pokemon.*;
class Rest extends StatusMove{
    protected  Rest() {
        super(Type.PSYCHIC, 0, 100);
    }
    @Override
    protected String describe(){
        return "Использует Rest";

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.SLEEP).attack(0.0D).turns(2));
        p.setMod(Stat.HP, (int) (p.getHP()-p.getStat(Stat.HP)));
    }

}