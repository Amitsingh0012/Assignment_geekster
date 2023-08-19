public class Ques16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n-1;i++){
            for(int j=n;j>i;j--){
                System.out.print("\t");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=i;j<=n;j++){
                System.out.print("\t");
            }
            for(int k=n-i;k>=0;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
