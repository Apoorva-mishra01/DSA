class Solution {
    public int totalNumbers(int[] digits) {
      int count=0;
      for(int num=100;num<=999;num++){
        if(num%2!=0){
            continue;
        }
        int[] freq=new int[10];
        for(int d: digits){
            freq[d]++;
        }
        int n=num;
        boolean possible=true;
        for(int i=0;i<3;i++){
            int digit=n%10;
            n/=10;
            if(freq[digit]==0){
                possible=false;
                break;
            }
            freq[digit]--;
        }
        if(possible){
            count++;
        }
      }
       return count; 
    }
}