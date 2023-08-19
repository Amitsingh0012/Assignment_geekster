//Question 1
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 2
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 3
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=n;j>i;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 4
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=n-1;j>i;j--){
//                System.out.print("\t");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 5
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//           for(int j=0;j<i;j++){
//               System.out.print("\t");
//           }
//           for(int k=n-i;k>0;k--){
//               System.out.print("*\t");
//           }
//           System.out.println();
//        }
//    }
//}



// QUestion 6
// public class Main {
////    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//           for(int j=0;j<(2*i);j++){
//               System.out.print("\t");
//           }
//           for(int k=5-i;k>0;k--){
//               System.out.print("*\t");
//           }
//           System.out.println();
//        }
//    }
//}


//Question 7
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==0||j==0||j==n-1||i==n-1){
//                    System.out.print("*\t");
//                }else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//Question 8
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==j||j==n-1-i) {
//                    System.out.print("*\t");
//                } else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}



//Question 9
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n-i;j++){
//                System.out.print("\t");
//            }
//            for (int j = 0; j <2*i+1; j++) {
//                    System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}


//Question 10
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=n;i>0;i--) {
//            for(int j=n-i;j>0;j--){
//                System.out.print("\t");
//            }
//            for (int j = 0; j <2*i-1; j++) {
//                    System.out.print("*\t");
//            }
//
//            System.out.println();
//        }
//    }
//}

//Question 11
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<=n;i++) {
//            for(int j=i;j<n;j++){
//                System.out.print("\t");
//            }
//            for (int j = 0; j <i; j++) {
//                    System.out.print("\t*\t");
//            }
//
//            System.out.println();
//        }
//    }
//}

//Question 12
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++) {
//            for(int j=0;j<n-i;j++){
//                System.out.print("\t");
//            }
//            for (int j = 0; j <2*i+1; j++) {
//                if(j%2==0){
//                    System.out.print("*\t");
//                }else {
//                    System.out.print("!\t");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

//Question 13
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//            for(int j=n-i;j>0;j--){
//
//            }
//        }
//    }
//}




////Question 17
//public class Main {
//    public static void main(String[] args) {
//        int n = 7;
//        for(int i=0;i<n/2;i++){
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<=2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i=n/2-1;i>=0;i--){
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<=2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}
//Question 18
//public class Main {
//    public static void main(String[] args) {
//        int n = 7;
//        for(int i=0;i<n/2;i++){
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("\t");
//            }
//            for(int j=0;j<=2*i;j++){
//                System.out.print("*\t");
//            }
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//        for(int i=n/2;i>=0;i--){
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("\t");
//            }
//            for(int j=0;j<=2*i;j++){
//                System.out.print("*\t");
//            }
//            for(int j=n/2-i;j>0;j--){
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 19
//public class Main {
//    public static void main(String[] args){
//        int n=7;
//
//        for(int i=0;i<=n/2;i++){
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//
//
//        for(int i=n/2-1;i>=0;i--){
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 20

//Question 21
//public class Main {
//    public static void main(String[] args) {
//        int n = 7;
//        for(int i=0;i<=n/2;i++){
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n/2-i;j>=0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 22
//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        for(int i=n;i>=0;i--){
//            for(int j=n-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            for(int j=0;j<2*i;j++){
//                System.out.print("\t");
//            }
//            for(int j=n-i;j>0;j--){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}
////Question 23
//
//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            for(int j=1;j<2*i;j++){
//                System.out.print((1) +"\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 24


//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            for(int j=1;j<2*i;j++){
//                System.out.print((i) +"\t");
//            }
//            System.out.println();
//        }
//    }
//}


////Question 25
//
//public class Main {
//    public static void main(String[] args) {
//        int count=1;
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            for(int j=1;j<2*i;j++){
//                System.out.print((count++) +"\t");
//            }
//            System.out.println();
//        }
//    }
//}


//Question 26
/*
public class Main {
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
}*/

////Question 27
//
//public class Main {
//    public static void main(String[] args) {
//        int count=1;
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print((j) +"\t");
//            }
//            for(int j=i;j>1;j--){
//                System.out.print(j-1+"\t");
//            }
//            System.out.println();
//        }
//    }
//}



//Question 28
//public class Main {
//    public static void main(String[] args) {
//        int count=1;
//        int z=0;
//        int n=7;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            count=i;
//            for(int j=1;j<=i;j++){
//                System.out.print((count++) +"\t");
//                z=count;
//            }
//            z-=2;
//            for(int j=i;j>1;j--){
//                System.out.print((z--)+"\t");
//            }
//            System.out.println();
//        }
//    }
//}


//Question 29

//public class Main {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=n-i;j>=0;j--){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=i;j++){
//                if(j==1) {
//                    System.out.print((i) + "\t");
//                }else{
//                    System.out.print("0"+"\t");
//                }
//            }
//            for(int j=i-1;j>0;j--){
//                if(j==1){
//                    System.out.print((i)+"\t");
//                }
//                System.out.print((0)+"\t");
//            }
//            System.out.println();
//        }
//    }
//}

//Question 30
//public class Main {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=n;i>0;i--) {
//            for (int j = n; j > 0; j--) {
//                System.out.print(j + "\t");
//            }
//            System.out.println();
//        }
//    }
//}


//Question 31
//public class Main {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=0;i<n;i++) {
//            for (int j = n; j > 0; j--) {
//                if(i+1!=j) {
//                    System.out.print(j + "\t");
//                }else{
//                    System.out.print("*"+"\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//Question 32

//public class Main {
//    public static void main(String[] args){
//        int n=5;
//        for(int i=1;i<=n;i++) {
//            for (int j = 1; j<2*i; j++) {
//                if(j%2==0){
//                    System.out.print("*\t");
//                }else {
//                    System.out.print(i + "\t");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>0;i--){
//            for (int j = 1; j<2*i; j++) {
//                if(j%2==0){
//                    System.out.print("*\t");
//                }else {
//                    System.out.print(i + "\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
