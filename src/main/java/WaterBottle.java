public class WaterBottle {

    private static int volume;

    public WaterBottle(){
        this.volume = volume = 100;
    }

    public int volume(){
        return this.volume;
    }

    public int drink(){         // cnage int to void
        return this.volume - 10;
    }

    public int empty(){         // change int to void
        return this.volume - this.volume;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }
}
