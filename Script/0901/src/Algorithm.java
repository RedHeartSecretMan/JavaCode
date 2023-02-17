public class Algorithm {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println("index="+binarySearch(array, 5));
    }
    public static int binarySearch(int[] array,int targetNum){
        if (array.length !=0) {
            int left = 0;
            int right = array.length;
            int mid;
            while (left <= right) {
                mid = (left + right) / 2;
                if (targetNum > array[mid]) {
                    left = mid + 1;
                } else if (targetNum < array[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
