import ru.ifmo.se.pokemon.*;
public class Jirachi extends Pokemon{
    public Jirachi(String name, int level){
        super (name, level);
        setStats(100, 100, 100, 100, 100, 100);
        setType(Type.STEEL, Type.PSYCHIC);
        setMove(new Rest(), new  DoubleTeam(), new FlashCannon(), new  DazzlingGleam());

    }
}