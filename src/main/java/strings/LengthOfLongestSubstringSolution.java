package strings;

public class LengthOfLongestSubstringSolution {
    public int solution(String str){
        int maxLength = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i ++){
            var x = str.charAt(i);
            int index = sb.indexOf(String.valueOf(x));
            if(index != -1){
                sb.delete(0, index + 1);
            }
            sb.append(x);
            maxLength = Math.max(maxLength, sb.length());
        }
        return maxLength;
    }
}
