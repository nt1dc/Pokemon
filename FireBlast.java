import ru.ifmo.se.pokemon.*;
class FireBlast extends SpecialMove{
    protected FireBlast(){
        super(Type.FIRE, 110, 85);
    }
    @Override
    protected String describe(){
        return "Использует Fire Blast";

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) Effect.burn(p);
    }
}
