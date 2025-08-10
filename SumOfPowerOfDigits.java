public class UserMainCode {
    public int SumOfPowerOfDigits(int input1) {
        String numStr = String.valueOf(input1);
        int len = numStr.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            int base = Character.getNumericValue(numStr.charAt(i));
            int exp;
            if (i == len - 1) {
                exp = 0; // last digit raised to power 0
            } else {
                exp = Character.getNumericValue(numStr.charAt(i + 1));
            }
            sum += (int) Math.pow(base, exp);
        }

        return sum;
    }
}