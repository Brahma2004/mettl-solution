class UserMainCode {
    public Result findOriginalFirstAndSum(int[] input1, int input2) {
        int[] original = new int[input2];

        // Last element of original is same as last of encoded
        original[input2 - 1] = input1[input2 - 1];

        // Decode from end to start
        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }

        // First number
        int firstNumber = original[0];

        // Sum of all numbers
        int sum = 0;
        for (int num : original) {
            sum += num;
        }

        // Return in Result object
        return new Result(firstNumber, sum);
    }
}

class Result {
    public final int output1;
    public final int output2;

    public Result(int output1, int output2) {
        this.output1 = output1;
        this.output2 = output2;
    }
}