import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++){
            hm.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++){
            if (hm.containsKey(nums2[i])){
                temp.add(nums2[i]);
                hm.remove(nums2[i]);
            }
        }
        int[] ans = new int[temp.size()];
        for (int i = 0; i < ans.length; i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}