public class Demo {
    public static void main(String[] args) {
        String str = "yearUp wilmington";
        String firstName = "Christopher";

        String word = "";
        for(int x = 7; x >= 4; x--) {
            word = word + firstName.charAt(x);
        }
        System.out.println(word);

//        System.out.println(str.substring(14)); // inclusive the 14 index
//
//        System.out.println(str.substring(0, 4)); //overloaded method
//        System.out.println(str.substring(4, 6));
//        System.out.println(str.substring(4,11));
//
//        System.out.println(firstName.substring(0, 5));
//        System.out.println(firstName.substring(4,8));
//        System.out.println(firstName.substring(8,11));
//
//        System.out.print(firstName.substring(7,8));
//        System.out.print(firstName.substring(6,7));
//        System.out.print(firstName.substring(5,6));
//        System.out.print(firstName.substring(4,5));


    }
}
