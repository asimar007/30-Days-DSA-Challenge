import java.util.*;

public class Intersection {
  public static int[] IntersectionArray(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> ans = new ArrayList<>();
    for (int num : nums1) {
      set.add(num);
    }
    for (int x : nums2) {
      if (set.contains(x)) {
        ans.add(x);
      }
      set.remove(x);
    }
    // convert ArrayList to Array
    int result[] = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
      result[i] = ans.get(i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums1 = { 4, 9, 5 };
    int[] nums2 = { 9, 4, 9, 8, 4 };
    int[] ans = IntersectionArray(nums1, nums2);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}