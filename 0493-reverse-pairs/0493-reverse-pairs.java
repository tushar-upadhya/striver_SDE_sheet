import java.util.ArrayList;

class Solution {
    static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    static int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > (2 * (long) nums[j])) {
                j++;
            }
            count += (j - (mid + 1));
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while (left <= mid) {
            temp.add(nums[left++]);
        }
        while (right <= high) {
            temp.add(nums[right++]);
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
        return count;
    }

    static int mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = (low + high) / 2;
        int inversions = mergeSort(nums, low, mid);
        inversions += mergeSort(nums, mid + 1, high);
        inversions += merge(nums, low, mid, high);
        return inversions;
    }
}
