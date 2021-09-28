public class Printer {

    private int sheetsRemaining;
    private int toner;


    public Printer(int sheetsRemaining, int toner){
        this.sheetsRemaining = sheetsRemaining;
        this.toner = toner;
    }

    public int paperLevel(){
        return this.sheetsRemaining;
    }

    public int tonerLevel(){
        return this.toner;
    }

    public void checkLevels(int pages, int copies) {
        if (this.sheetsRemaining >= pages * copies) {
            print(pages, copies);
        }
    }

    public boolean print(int pages, int copies) {
        int totalRequired = pages * copies;
        if (totalRequired <= this.sheetsRemaining &&
                totalRequired <= this.toner) {
            this.sheetsRemaining -= totalRequired;
            this.toner -= totalRequired;
            return true;
        } else {
            return false;
        }
    }


}
