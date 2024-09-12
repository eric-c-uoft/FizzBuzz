public class Multiples {
    public static void main(String[] args) {
        System.out.println((checkMultiple(1000)));
    }

    public static int checkMultiple(int n) {
        int i = 1;
        int count = 0;
        while (i <= n) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        i++;
        }
        return count;
    }
}
