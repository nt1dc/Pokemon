import ru.ifmo.se.pokemon.*;
class ShadowBall extends StatusMove {
    protected ShadowBall() {
        super(Type.GHOST, 80, 100);
    }
    @Override
    protected String describe(){
        return "Использует Shadow Ball";

    }
    @Override
    protected void 	applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
