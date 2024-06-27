public class productEleArr {
    public static void main(String[] args) {
        int[] arr = {4, 58, 6, 9, 89, 23, 25, 54, 67};
        int n = arr.length;
        int ProductEle = arr[0];
        for (int i = 1; i <n; i++) {
//            ProductEle=ProductEle*arr[i];
            ProductEle *= arr[i];
        }

        System.out.println(ProductEle);
    }
}
