public class Ques33 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("\t");
            }
            for(int j=n-i;j<=n;j++){
                if(j==10){
                    System.out.print(0+"\t");
                }else {
                    System.out.print(j+"\t");
                }
            }
            for(int j=n-1;j>n-i-1;j--){
                if(j==10){
                    System.out.print(0+"\t");
                }else {
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
    }
}
