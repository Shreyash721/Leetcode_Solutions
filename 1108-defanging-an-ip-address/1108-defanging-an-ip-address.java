class Solution {
    public String defangIPaddr(String ad) {
        ad=ad.replace(".","[.]");
        return ad;
    }
}