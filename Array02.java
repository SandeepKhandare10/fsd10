public class Array02 {
    public static void main(String[] args) {

        int []array={40,12,25,30,67,8,9,99,56};
        int n=array.length;
        int MaxEle=array[0];

        for (int i=1;i<n;i++){

            System.out.print(array[i]+" ");
//            if(array[i]>MaxEle){
//                MaxEle=array[i];
//            }
        }
//        System.out.println("Max number is"+MaxEle);

    }
}
