public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Printer p=new Printer(50,false);
        System.out.println( p.addToner(50));
        System.out.println("initial page count = "+p.getPagesPrinted());
       int pagesPrinted= p.printPages(4);
        System.out.println("pages printed was "+ pagesPrinted+
                " new tatalprint count for printer= "+p.getPagesPrinted());
        pagesPrinted= p.printPages(2);
        System.out.println("pages printed was "+ pagesPrinted+
                " new tatalprint count for printer= "+p.getPagesPrinted());
    }
}