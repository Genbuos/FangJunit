package strings;

public class ValidPalindromeIISolution {
    public boolean vps(String str){

        int left = 0;
        int right = str.length() - 1;
        while(left < right){

            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;


            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;

            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return isPalindrome(str.substring(left + 1, right + 1)) || isPalindrome(str.substring(left, right));
            }
            left++;
            right--;

        }

        return true;
    }

    public boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equalsIgnoreCase(str);
    }


    //An Algo with good Space Comp
    public boolean validPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right){

            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){

                left++;

            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){

                right--;

            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){

                return isPalindromeII(str, left + 1, right ) || isPalindromeII(str, left, right - 1);


            }
            left++;
            right--;
        }

        return true;


    }
    private boolean isPalindromeII(String str, int left, int right){
        while(left < right){

            while(left < right && !Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
