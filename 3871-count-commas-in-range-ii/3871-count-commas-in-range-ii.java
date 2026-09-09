class Solution {
    public long countCommas(long n) {
        if(n<1000)return 0;
        long sum=0;
        for(long i=1000;i<=n;i*=1000){

            sum += n-i+1;
        }
        return sum;
    }
}