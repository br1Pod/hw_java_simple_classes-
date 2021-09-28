public class WaterBottle {

    private static int volume;

    public WaterBottle(){
        this.volume = volume = 100;
    }

    public int volume(){
        return this.volume;
    }

    public void drink(){         // change int to voi
        this.volume -= 10;
    }

    public void empty(){         // change int to void
        this.volume = 0;
    }

    public int fill(){
        this.volume = 100;
        return this.volume;
    }
}
