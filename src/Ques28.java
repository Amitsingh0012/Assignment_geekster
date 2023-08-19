public class Ques28 {
    public static void main(String[] args) {
        int count=1;
        int z=0;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("\t");
            }
            count=i;
            for(int j=1;j<=i;j++){
                System.out.print((count++) +"\t");
                z=count;
            }
            z-=2;
            for(int j=i;j>1;j--){
                System.out.print((z--)+"\t");
            }
            System.out.println();
        }
    }
}
