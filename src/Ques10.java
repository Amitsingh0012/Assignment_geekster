public class Ques10 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--) {
            for(int j=n-i;j>0;j--){
                System.out.print("\t");
            }
            for (int j = 0; j <2*i-1; j++) {
                    System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
