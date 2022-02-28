// { Driver Code Starts
//Initial Template for C

#include<stdio.h>
  

 // } Driver Code Ends
//User function Template for C

long long int floorSqrt(long long int x) 
{
    // Your code goes here
    long long int low = 0;
    long long int high = x;
    long long int mid = 0;
    
    while(low <= high) {
        
        mid = low + (high - low) / 2;
        
        if(mid * mid == x)
            return mid;
            
        if(mid * mid > x)
            high = mid - 1;
            
        if(mid * mid < x)
            low = mid + 1;
    }
    
    return low-1;
}

// { Driver Code Starts.

int main()
{
	int t;
	scanf("%d", &t);
	while(t--)
	{
		long long n;
		scanf("%ld", &n);
	
		printf("%ld\n", floorSqrt(n));
	}
    return 0;   
}
  // } Driver Code Ends