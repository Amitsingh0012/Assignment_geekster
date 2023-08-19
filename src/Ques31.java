public class Ques31 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++) {
            for (int j = n; j > 0; j--) {
                if(i+1!=j) {
                    System.out.print(j + "\t");
                }else{
                    System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }
    }
}
