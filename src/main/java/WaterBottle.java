public class WaterBottle {

    private static int volume;

    public WaterBottle(){
        this.volume = volume = 100;
    }

    public int volume(){
        return this.volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return 0;
    }
}
