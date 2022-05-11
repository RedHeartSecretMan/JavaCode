import java.util.Arrays;
import java.util.Comparator;

class MaxNumber {
    public static String Solution(int[] nums) {
        int n = nums.length;
        StringBuilder rs = new StringBuilder();
        String[] array = new String[n];
        for(int i = 0; i < n; i++)
            array[i] = String.valueOf(nums[i]);
        Arrays.sort(array, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return (o2+o1).compareTo(o1+o2);
                    }
                }
        );
        for(int i = 0; i < n-1; i++) {
            if(!(rs.length() == 0 && "0".equals(array[i]))){
                rs.append(array[i]);
            }
        }
        return rs.append(array[n-1]).toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,22,3,5,6};
        String a = Solution(nums1);
        System.out.println(a);
    }
}
