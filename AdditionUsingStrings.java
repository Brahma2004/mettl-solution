class UserMainCode {
    public String addStrings(String input1, String input2) {
        StringBuilder result = new StringBuilder();

        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? input1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? input2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        return result.reverse().toString();
    }
}