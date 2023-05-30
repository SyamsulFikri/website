public class looping {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        for (int i = 0; i < 10; i++) {
            for (int c = 10; c > i; c--) {
                System.out.print(" ");
            }
            for (int d = 0; d < i; d++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int j = 0; j < 10; j++) {
            for (int c = 0; c < j; c++) {
                System.out.print(" ");
            }
            for (int d = 10; d > j; d--) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
