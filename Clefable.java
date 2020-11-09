import ru.ifmo.se.pokemon.*;
public class Clefable extends Clefairy {
    public Clefable(String name, int level){
        super(name, level);
        setStats(95, 70, 73, 95, 90, 60);
        setType(Type.FAIRY);
        setMove(new ShadowBall(), new DreamEater(), new CosmicPower(),new Psychic());
    }

}