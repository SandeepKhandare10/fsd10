public class friquentNumarr {
    public static void main(String[] args) {
        int []arr={10,11,11,11,12,13,13,11,14};
        int n=arr.length;
        int tagrt=11;
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==tagrt){
                    count++;
//                    break;

            }
        }
        System.out.println(count);
    }
}
