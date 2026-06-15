class Solution {
    public String reverseVowels(String arr) {
       char[] s=arr.toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<=j){
            if((s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' || s[i]=='a'|| s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') && (s[j]=='A' || s[j]=='E' || s[j]=='I' || s[j]=='O' || s[j]=='U' || s[j]=='a'|| s[j]=='e' || s[j]=='i' || s[j]=='o' || s[j]=='u')){

                char t=s[i];
                s[i]=s[j];
                s[j]=t;
                i++;
                j--;
            }
            else if((s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' || s[i]=='a'|| s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') && (s[j]!='A' || s[j]!='E' || s[j]!='I' || s[j]!='O' || s[j]!='U' || s[j]!='a'|| s[j]!='e' || s[j]!='i' || s[j]!='o' || s[j]!='u')){
                j--;
            }
            else{
                i++;
            }
            
        }
        arr=new String(s);
        return arr;
    }
}