public class Main {
    public static void main(String[] args){
        book b1 = new book("Guardians");
        book b2 = new book("Alie parusa");
        magazine m1 = new magazine("Behind the wheel");
        magazine m2 = new magazine("Expert");


        printable[] printables = {b1,b2,m1,m2};
        for (printable printable: printables){
            printable.print();

        }
    }
}