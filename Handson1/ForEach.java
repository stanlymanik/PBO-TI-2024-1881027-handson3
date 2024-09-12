package Handson1;

public class ForEach {
    public static void main(String[] args) {
        String[] kumpulanBuahh = new String[] {"Apel ", "pisang", "Mangga", "jeruk"};
        for (String namaBuah : kumpulanBuahh) { // Perbaiki nama variabel di sini
            if (namaBuah.equals("Mangga") || namaBuah.equals("pisang")) {
                continue; // Lewati buah "Mangga" dan "pisang"
            }
            System.out.println(namaBuah); // Tampilkan buah selain "Mangga" dan "pisang"
        }
    }
}
