void main() {
    // 1. two-sum
    runTwoSum();
}

void runTwoSum() {
    final var test1 = new Question().twoSumSpeed(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(test1)); // [0,1]
    final var test2 = new Question().twoSumSpeed(new int[]{3, 2, 4}, 6);
    System.out.println(Arrays.toString(test2)); // [1,2]
    final var test3 = new Question().twoSumSpeed(new int[]{3, 3}, 6);
    System.out.println(Arrays.toString(test3)); // [0,1]
    final var test4 = new Question().twoSumSpeed(new int[]{-1, -2, -3, -4, -5}, -8);
    System.out.println(Arrays.toString(test4)); // [2,4]
}
