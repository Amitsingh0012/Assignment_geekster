public class Ques26 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("\t");
            }
            for(int j=1;j<2*i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
