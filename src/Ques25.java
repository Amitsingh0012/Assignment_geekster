public class Ques25 {
    public static void main(String[] args) {
        int count=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("\t");
            }
            for(int j=1;j<2*i;j++){
                System.out.print((count++) +"\t");
            }
            System.out.println();
        }
    }
}
