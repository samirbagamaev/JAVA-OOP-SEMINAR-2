package WORK.Units;

public class Sniper extends Shooter {
    public Sniper(String name) {
        super(name, 1, new int [] {1,3}, 2, 1,1);
    }

    @Override
    public String getInfo() {
        return String.format("%s  arrows: %d  accuracy: %d",
                super.getInfo(), this.arrows, this.accuracy);
    }


}