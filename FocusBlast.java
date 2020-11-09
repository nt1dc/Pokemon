import ru.ifmo.se.pokemon.*;
class FocusBlast extends StatusMove {
    protected FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected String describe(){
        return "Использует Focus Blast";

    }
    @Override
    protected void 	applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
