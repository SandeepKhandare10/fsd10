public class SumEleArr {
    public static void main(String[] args) {
        int[] array={8,15,14,68,95,88,102,123};
        int n=array.length;
        int sum =array[0];
        for (int i=0;i<n;i++){
         //   sum=sum+array[i];
            sum +=array[i];
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
