public class Ques6 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<(2*i);j++){
                System.out.print("\t");
            }
            for(int k=5-i;k>0;k--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
