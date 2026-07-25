class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean sign=true;
        if(x<0){
            sign=false;
        }
        x=Math.abs(x);
        while(x>0){
            int ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }


        }
        if(!sign){
            return -1*(int)rev;
        }
        return (int)rev;
    }
}