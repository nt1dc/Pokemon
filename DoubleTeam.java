import ru.ifmo.se.pokemon.*;
class DoubleTeam extends StatusMove{
    protected  DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected String describe(){
        return "Использует DoubleTeam";

    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,+1);
    }
}