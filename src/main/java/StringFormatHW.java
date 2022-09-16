public class StringFormatHW {

    //a static method
    public static String printReceipt(String product, int qty, double price, float miles){
        //given a quanity and price we need to figure out the total,
        String empty = "";
        double fee;
        double total = qty * price;
        //we need to figure out delivery fee
        // -create a set of conditions that use the miles to charge customer a fee
        if(miles <= 4){
            //charge them $2
            fee = 2.00;
            //calculate total
            total = total + fee;
        } else if (miles > 4 && miles <=15){
            fee = 5.00;
            total = total + fee;

        } else if(miles > 15 && miles <= 25){
            fee = 10.00;
            total = total + fee;

        } else if (miles > 25 && miles <= 50){
            fee = 15.00;
            total = total + fee;
        }else{
            fee = 20.00;
            total = total + fee;
        }

        String variables = String.format("Product %4s Qty %4s  Price %4s Miles %4s Total", empty, empty, empty, empty);
        String dashes = String.format("---- %7s ---- %4s ---- %5s ---- %5s ----", empty, empty,empty, empty);
        String results = String.format("%s %10d %11.2f %11.2f %11.2f", product, qty, price, miles, total);



        //return the value that will be printed on the receipt

        return variables + "\n"+ dashes + "\n" + results;



    }


    public static void main(String[] args) {
        String returnValue = printReceipt("Rice",20, 5.00, 10.0f);
        System.out.println(returnValue);




    }

    //A loop, a variable, need objects, if statement, another class, parameterized, creating method
    //it becomes a recipe of instructions
    //

}

