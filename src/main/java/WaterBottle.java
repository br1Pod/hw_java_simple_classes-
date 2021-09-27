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
        return this.volume - this.volume;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }
}
