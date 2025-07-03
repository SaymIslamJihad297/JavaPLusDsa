public class TrappingRainWater {
    public static int trapRain(int[] height){
        int left = 0, right = height.length-1;
        int leftMax=0, rightMax = 0;
        int totalWater = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }else{
                    totalWater += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        System.out.println(totalWater);
        return totalWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        trapRain(height);
    }
}

