package Handson1;
public class ForLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[]{"Apel", "Pisang", "Mangga", "Jeruk"};
        for (int i = 0; 1 < 4; i++){
            if (i == 4) {
                break;
            }
            System.out.println("Elemen ke " + (i + 1) + " : " + kumpulanBuah[i]);
     }
  }
}