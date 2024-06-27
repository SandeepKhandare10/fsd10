public class FsdPattern {
    public static void main(String[] args) {
        int n=4;
//        *
//        **
//        ***
//        ****
//        *****
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//          *****
//          ****
//          ***
//          **
//          *
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (j+i==n+1||i==j){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//  *****
//   ****
//    ***
//     **
//      *
//        for (int i=1;i<=n;i++){
//            for ( int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=n;i++){
//            for ( int j=1;j<=i;j++){
//                System.out.print("1");
//            }
//            for (int j=n;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        int num=1;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int sum=i+j;
//               if (sum%2==0){
//                   System.out.print("1 ");
//               }
//               else {
//                   System.out.print("0 ");
//               }
//            }
//            System.out.println();
//        }
//        2
//        34
//        456
//        5678
//        678910
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int sum=i+j;
//                System.out.print(sum);
//            }
//            System.out.println();
//        }
//        *       * * * *
//        *       *
//        *       *
//        * * * * * * * *
//                *     *
//                *     *
//                *     *
//        * * * * *     *

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (j==1||i==n){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            for (int j=1;j<=n;j++){
//                if (i==n|| i==1||j==1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==n){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            for (int j=1;j<=n+1;j++){
//                if (j==n|| j==1 ){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        int j;
//        A A A A A
//        B B B B
//        C C C
//        D D
//        E
//        for (int i=1,p='A';i<=5;i++,p++){
//            for (int j=5;j>=i;j--){
//                System.out.print((char)p+" ");
//            }
//            System.out.println();
////        }
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        for (int i=1,p='A';i<=5;i++,p++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)p+" ");
//            }
//            System.out.println();
//        }
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=5;i++){
//            for (int j=4;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        *****
//         ****
//          ***
//           **
//            *
        for (int i=5;i>=1;i--){
            for (int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
