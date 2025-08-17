class UserMainCode
{
    public int sumOfNonPrimeIndexValues(int[] input1, int input2)
    {
        int sum = 0;
        for (int i = 0; i < input2; i++) {
            if (!isprime(i)) {
                sum += input1[i];
            }
        }
        return (sum);
    }

    private boolean isprime(int num)
    {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
