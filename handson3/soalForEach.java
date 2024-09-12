package handson3;

public class soalForEach {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int num : angka) {

            if (num > 15) {
                break;
            }
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}