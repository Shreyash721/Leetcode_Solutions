class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            Character ch=letters[i];
            if(ch>target){
                return ch;
            }
        }

        return letters[0];
    }
}