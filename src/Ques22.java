public class Ques22 {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 0; i < n; i++) {
            for(int j=0;j<n-i;j++){
                if(j==n-1){
                    continue;
                }
                System.out.print("*\t");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("\t");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
