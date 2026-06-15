class Solution {
    public int pos(char c){
        switch(c){
        case 'a': return 26;
        case 'b': return 25;
        case 'c': return 24;
        case 'd': return 23;
        case 'e': return 22;
        case 'f': return 21;
        case 'g': return 20;
        case 'h': return 19;
        case 'i': return 18;
        case 'j': return 17;
        case 'k': return 16;
        case 'l': return 15;
        case 'm': return 14;
        case 'n': return 13;
        case 'o': return 12;
        case 'p': return 11;
        case 'q': return 10;
        case 'r': return 9;
        case 's': return 8;
        case 't': return 7;
        case 'u': return 6;
        case 'v': return 5;
        case 'w': return 4;
        case 'x': return 3;
        case 'y': return 2;
        case 'z': return 1;
        }
        return 0;
    }
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            char ch=s.charAt(i-1);
            int n=pos(ch);
            sum=sum+i*n;
        }
        return sum;
    }
}