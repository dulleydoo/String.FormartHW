public class Demo2 {
    public static void main(String[] args) {
//        System.out.printf("My name is %s. I was born in the year %d . ", "Mike Jones", 1998);
//
//        int age = 22;
//       String result = String.format("My age is %d", age);
//        System.out.println(result);

        String empty = "";
        String product = "Rice";
        int qty = 20;
        double price = 5.00;
        double miles = 10.0;
        double total = 105;

        String variableName = String.format("Product %4s Qty %4s  Price %4s Miles %4s Total", empty, empty, empty, empty);
        String dashes = String.format("---- %7s ---- %4s ---- %5s ---- %5s ----", empty, empty,empty, empty);
        String result = String.format("%s %10d %11.2f %11.2f %11.2f", product, qty, price, miles, total);
        System.out.println(variableName);
        System.out.println(dashes);
        System.out.println(result);

    }
}
   /* WRITE A PROGRAM THAT CALCULATES TOTAL COST OF USER'S ITEMS
        YOUR OUTPUT SHOULD BE FORMATTED AS SEEN BELOW!!
        ________________________________________________



        Product      Qty      Price       Miles      Total
        ----         ---      -----      -----      -----
        Rice          20        5.0       10.0      105.0

        Thank you. Come Again!!  */






