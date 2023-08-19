public class Ques15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(2*i);j++){
                System.out.print("\t");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<(2*i)-1;j++){
                System.out.print("\t");
            }
            for(int k=n-i;k>=0;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
