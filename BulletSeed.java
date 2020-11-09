import ru.ifmo.se.pokemon.*;
class BulletSeed extends PhysicalMove {
    @Override
    protected String describe(){
        return "Использует Bullet Seed";

    }


    protected BulletSeed() {
        type=Type.GRASS;
        double a = Math.random();
        if (a <= 0.375) {
            power = 50;
            hits = 2;
        }
        if (0.375<a & a<=0.75) {
            power = 75;
            hits = 2;
        }
        if (0.75<a & a<=0.875){
            power=100;
            hits=4;
        }
        if (a>0.875){
            power=125;
            hits=5;
        }


    }
}


