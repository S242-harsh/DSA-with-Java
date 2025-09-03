public class trappingRanwater {
  public static int trapedWater(int height[]) {
    int n = height.length;
    // Calculate left max boundary -array
    int left_Max[] = new int[n];
    left_Max[0] = height[0];
    
    for (int i = 1; i < n; i++) {
      left_Max[i]= Math.max(height[i], left_Max[i-1]);
      
    }
    // Calculate right max boundary -array
    
    
    
    int right_Max[] = new int[n];
    right_Max[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
      right_Max[i]=Math.max(height[i], right_Max[i+1]);
    }

     int trappedWater=0;
    // loop
    for( int i=0;i<n;i++){
      // water lavel=min(left max boundary,right max boundary)
      int waterLavel=Math.min(left_Max[i], right_Max[i]);
      // trapedwater=waterlavel-height
      trappedWater+=waterLavel-height[i];

    }
    return trappedWater;


  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
System.out.println(trapedWater(height));
  }


}
