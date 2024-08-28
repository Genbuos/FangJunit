package strings;

public class BackspaceStringCompareSolution {
    public boolean compare(String s, String t){
        return solution(s).equals(solution(t));
    }

    /**
     *
     * @param str
     * @return this iterates through our strings and build completely new strings via
     * StringBuilder thus giving us access to said string's index positions.
     */
    private String solution(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < str.length(); i++){
            var x = str.charAt(i);
            if(x == '#'){
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(x);
            }

        }
        return sb.toString();
    }
}
