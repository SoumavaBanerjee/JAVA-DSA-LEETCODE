class Solution {
    public double myPow(double x, int n) {
        
        if ( n == 0)
            return 1.00000;
        
        double res = 0;
        

        res = myPow(x,n/2);
            
        if(n%2 != 0 && n < 0) 
            return (res * res)/x;
        
        if(n%2 != 0 && n > 0)
            return x * res * res;
        
        return res * res;
            
    }
}