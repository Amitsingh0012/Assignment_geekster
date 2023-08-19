public class Ques20{
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = i; j <= n / 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                if (j == 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print(" * ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n / 2; i >= 1; i--) {
            for (int j = i; j <= n / 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                if (j == 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print(" * ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
