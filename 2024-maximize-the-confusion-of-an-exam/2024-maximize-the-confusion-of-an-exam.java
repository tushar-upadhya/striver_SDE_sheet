class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        
        int j = 0;
        int count = 0;
        int result = 0;
        
        for(int i = 0; i < answerKey.length(); i++){
            count += answerKey.charAt(i) == 'T' ? 1 : 0;
            int zero = i - j + 1 - count;
            
            int min = count > zero ? zero : count;
            while(min > k){
                count -= answerKey.charAt(j++) == 'T' ? 1 : 0;
                zero = i - j + 1 - count;
                
                min = count > zero ? zero : count;
            }
            result = Math.max(result, i - j + 1);
        }        
        return result;
    }
}