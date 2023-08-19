public class Ques14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print("\t");
            }
            for(int j=0;j<i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
