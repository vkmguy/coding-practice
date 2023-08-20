public class ContainerWithMaxWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int currentArea = Math.min(height[left],height[right])*width;
            maxArea = Math.max(maxArea, currentArea);
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMaxWater c = new ContainerWithMaxWater();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(c.maxArea(height));
    }
}
