int[] freq = new int[10];
        for(int i =0;i<input2;i++){
            int num = input1[i];
            String s = String.valueOf(num);
            for (int j = 0;j<s.length();j++){
                char c = s.charAt(j);
                if (Character.isDigit(c)){
                    freq[c - '0']++;
                }
            }
        }
        int maxFreq =-1;
        int mostFrequentDigit=1;
        for(int i = 0;i<10;i++){
            if(freq[i]>=maxFreq){
                maxFreq = freq[i];
                mostFrequentDigit = i;
            }
        }
		return mostFrequentDigit;
	}
}