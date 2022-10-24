public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = new int[]{2, 2, 1};
        int[] exampleTwo = new int[]{4, 1, 2, 1, 2};
        int[] exampleThree = new int[]{1};

        System.out.println("Example One : " + solution.singleNumber(exampleOne));
        System.out.println("Example Two : " + solution.singleNumber(exampleTwo));
        System.out.println("Example Three : " + solution.singleNumber(exampleThree));
    }
}
