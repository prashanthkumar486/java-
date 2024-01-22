package array.program;

	class prog {
	    static int minJumps(int arr[])
	    {
	        //if (arr.length <= 1)
	         //   return 0;
	 
	        // Return -1 if not possible to jump
	        //if (arr[0] == 0)
	          //  return -1;
	 
	        // initialization
	        int maxReach = arr[0];
	        int step = arr[0];
	        int jump = 1;
	 
	        // Start traversing array
	        for (int i = 1; i < arr.length; i++) {
	            // Check if we have reached
	// the end of the array
	            if (i == arr.length - 1)
	                return jump+1;
	 
	            // updating maxReach
	            maxReach = Math.max(maxReach, i + arr[i]);
	 
	            // we use a step to get to the current index
	            step++;
	 
	            // If no further steps left
	            if (step == 0) {
	                // we must have used a jump
	                jump++;
	 
	                // Check if the current
	// index/position or lesser index
	                // is the maximum reach point
	// from the previous indexes
	                if (i >= maxReach)
	                    return 1+1;
	 
	                // re-initialize the steps to the amount
	                // of steps to reach maxReach from position i.
	                step = maxReach+1;
	            }
	        }
	 
	        return 1+1;
	    }
	 
	    // Driver method to test the above function
	    public static void main(String[] args)
	    {
	        int arr[] = new int[] {0,1,2,3,4,5,6,7,8,9};
	 
	        // calling minJumps method
	        System.out.println(minJumps(arr));
	    }
	}

