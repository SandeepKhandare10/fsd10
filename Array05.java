public class Array05 {
    public static void main(String[] args) {

        int []array={40,12,25,30,67,8,9,99,56};
        int n=array.length;
        int AddEle=array[0];

        for (int i=1;i<n;i++){
//            if(array[0]+array[i]){
                AddEle*=array[i];
            System.out.println(AddEle);
            }
//        System.out.println("sum of arry"+AddEle);
        }
//        System.out.println("Max number is"+AddEle);

    }
//}