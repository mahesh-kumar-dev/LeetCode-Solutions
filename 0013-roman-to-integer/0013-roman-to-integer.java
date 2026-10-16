class Solution {
    public int romanToInt(String s) {
        // total variable handle the final result of the of the roman number 
        int total = 0;
        // n variable is the total length of the string 
        int n = s.length();

        // Now I have to separate each of the string value and store it into the variable then make the comparison like if the smaller is ahead the larger then it would be subtracted and if not then it would be added to total one
        for(int i = 0; i < n; i++){
            // this stores the value of each character from left to right using the method of the getValue which has actually implemented the switch case.
            int currentValue = getValue(s.charAt(i));
            
            // Now critcial analysis if the smaller value precedes larger one then it would be subtracted
            if(i < n - 1 && currentValue < getValue(s.charAt(i+1))){
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;

        
    }

    // Firstly i have to mapping the roman symbols concrete values using switch statement
        public int getValue(char c){
            switch(c){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default : return 0;    
            } 
        }
}