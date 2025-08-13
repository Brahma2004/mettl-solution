public class alternate add_sub on N {
    public int seriesN(int input1, int input2, int input3, int input4){
    // Read only region end
   
    if (input4 == 1) {
        return input1;
    }
    if (input4 == 2) {
        return input2;
    }
    if (input4 == 3) {
        return input3;
    }
    int gap1 = input2 - input1;
    int gap2 = input3 - input2; 
    int currentVal = input3;
    for (int i = 4; i <= input4; i++) {
        if (i % 2 == 0) {
            currentVal += gap1;
        } else { 
            currentVal += gap2;
        }
    }
return currentVal;
}
}
