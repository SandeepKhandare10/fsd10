public class loop01 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }

        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }


//        int p = 'A';
//        for (int i = 1 ; i <= 5; i++,p++) {
//            for (int j = 1; j <= 5; j++){
//            if(i==j || i+j == 6) {
//                System.out.print((char)p);
//            }else {
//                System.out.print(" ");
//            }
//
//        }
//        System.out.println();


}
}