public class Loops {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= n);
    }
}