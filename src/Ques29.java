public class Ques29 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                if(j==1) {
                    System.out.print((i) + "\t");
                }else{
                    System.out.print("0"+"\t");
                }
            }
            for(int j=i-1;j>0;j--){
                if(j==1){
                    System.out.print((i)+"\t");
                    continue;
                }
                System.out.print((0)+"\t");
            }
            System.out.println();
        }
    }
}
