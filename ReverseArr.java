public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int[] newarr=new int[n];


        for (int i=0;i<n/2;i++){
            newarr[i]=arr[n-i-1];
//            int temp =arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
            }
        for (int i=0;i<n;i++){
            System.out.print(newarr[i]);
        }

    }
}
