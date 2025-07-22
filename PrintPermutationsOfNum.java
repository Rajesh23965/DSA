
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPermutationsOfNum {
    public static void backtrack(int[] nums, List<Integer> currentP, List<List<Integer>> result) {
        if (currentP.size() == nums.length) {
            result.add(new ArrayList<>(currentP));
            return;
        }
        for (int num : nums) {
            if (!currentP.contains(num)) {
                currentP.add(num);
                backtrack(nums, currentP, result);
                currentP.remove(currentP.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n =sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        PrintPermutationsOfNum solution = new PrintPermutationsOfNum();
        List<List<Integer>> permutations = solution.permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

/*
 * class Solution {
 * public List<List<Integer>> permute(int[] nums) {
 * List<List<Integer>> result=new ArrayList<>();
 * backtrack(nums, new ArrayList<>(),result);
 * return result;
 * }
 * private void backtrack(int[] nums, List<Integer> currentPermutation,
 * List<List<Integer>> result) {
 * if (currentPermutation.size() == nums.length) {
 * result.add(new ArrayList<>(currentPermutation));
 * return;
 * }
 * 
 * for(int num:nums){
 * if(!currentPermutation.contains(num)){
 * currentPermutation.add(num);
 * backtrack(nums,currentPermutation,result);
 * currentPermutation.remove(currentPermutation.size()-1);
 * }
 * }
 * }
 * public static void main(String[] args){
 * int[] nums={1,2,3};
 * Solution sol=new Solution();
 * List<List<Integer>> permutations=sol.permute(nums);
 * for(List<Integer> permutation:permutations){
 * System.out.println(permutation);
 * }
 * 
 * }
 * }
 */