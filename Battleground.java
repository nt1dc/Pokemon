import ru.ifmo.se.pokemon.*;
public class Battleground{
    public static void main(String[] args){
        Battle field = new Battle();
        field.addAlly(new Jirachi("jojo",1));
        field.addAlly(new Pumpkaboo("papochka",2));
        field.addAlly(new Gourgeist("sinok",3));
        field.addFoe(new Clefable("topDonater",1));
        field.addFoe(new Cleffa("mikroslav",1));
        field.addFoe(new Clefairy("mikrochel",1));
        field.go();
    }
}
