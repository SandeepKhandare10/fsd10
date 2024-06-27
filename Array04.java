public class Array04 {
    public static void main(String[] args) {

        int []array={40,12,25,30,67,8,9,99,56};
        int n=array.length;
        int MinEle=array[0];

        for (int i=1;i<n;i++){
            if(array[i]<MinEle){
                MinEle=array[i];
            }
        }
        System.out.println("Max number is"+MinEle);

    }
}