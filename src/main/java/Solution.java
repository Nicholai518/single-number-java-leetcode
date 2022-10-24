public class Solution {
    public int singleNumber(int[] nums) {
        // result that will be returned
        int result = 0;

        // iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // this is using bit manipulation
            // ^= is XOR
            // if we take XOR of zero and some bit, it will return that bit
            // if we take ZOR of two same bits, it will return 0
            // we can XOR all the bits together to find the unique number

            // EX: [2, 2, 1]
            // result is set to zero, first element is 2, 0 XOR 2 results in 2
            // 2 XOR 2 results in zero
            // 0 XOR 1 results in 1
            result ^= nums[i];
        }
        return result;
    }
}
