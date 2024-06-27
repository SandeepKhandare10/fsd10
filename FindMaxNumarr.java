public class FindMaxNumarr {
    public static void main(String[] args) {
        int  arrEle[]={10,12,15,32,45,65,85,9};
        int n=arrEle.length;
        int Maxnum=arrEle[0];

        for (int i=0;i<n;i++){
            if (Maxnum< arrEle[i]){
                Maxnum=arrEle[i];

            }
        }
        System.out.println("Maxnum is "+Maxnum);
    }

}
