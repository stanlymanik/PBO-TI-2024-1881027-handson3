package Handson1;

public class WhileLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[] {"Apel ", "pisang", "Mangga", "jeruk"};
        int counter = 0;
        while (counter < kumpulanBuah.length) {
            System.out.println("Element ke -" + (counter + 1) + ":" + kumpulanBuah[counter]);
            counter++;
        }
    }
}
