public class Printer {

    private  int tonerLevel;
    private int pagesPrinted=0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel>-1 && tonerLevel<100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel=-1;
        }
       this.duplex=duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int  addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if ((this.tonerLevel+tonerAmount)>100){
                return-1;
            }else {
            this.tonerLevel+=tonerAmount;
            }
        }
        return this.tonerLevel;
    }
    //parameter mean value we set from main by callring the method?
    //variable the value or the name we pass from method
    public int printPages(int pages){
        int pagesToPrint=pages;
        if (this.duplex==true){
            pages=pages/2;

        }
        this.pagesPrinted=pagesToPrint;

    return pages;
    }
}
