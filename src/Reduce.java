public class Reduce {
    public static void main(String[] args) {
        System.out.println(doReduce(100));
    }
    public static int doReduce(int n){
        int i = 0;
        while (n != 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n = n - 1;
            }
        i++;
        }
    return i;
    }
}
