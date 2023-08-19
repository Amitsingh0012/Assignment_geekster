public class Ques17 {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0;i<n/2;i++){
            for(int j=n/2-i;j>0;j--){
                System.out.print("*\t");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("\t");
            }
            for(int j=n/2-i;j>0;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n/2-1;i>=0;i--){
            for(int j=n/2-i;j>0;j--){
                System.out.print("*\t");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("\t");
            }
            for(int j=n/2-i;j>0;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}