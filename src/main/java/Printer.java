public class Printer {
    private int pages_left;
    private int toner;

    public Printer(int pages_left, int toner) {
        this.pages_left = pages_left;
        this.toner = toner;
    }

    public int getPages() {
        return this.pages_left;
    }

    public int getToner() {
        return this.toner;
    }

    public int printPages(int pages, int copies) {
        if (((pages * copies) > this.pages_left) || (((pages * copies) > this.toner ))) {
            return -1;
        } else {
            this.pages_left -= (pages * copies);
            this.toner -= (pages * copies);
            return this.pages_left;
        }
    }

}
