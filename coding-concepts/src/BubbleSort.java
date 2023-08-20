public class BubbleSort {

    public int heightChecker(int[] heights) {

        boolean hasSwapped = true;
        int swapped = 0;

        int[] alt = new int[heights.length];

        for(int i=0;i<heights.length;i++){
            alt[i] = heights[i];
        }

        while(hasSwapped){
            hasSwapped = false;
            for(int i=0;i<alt.length - 1;i++){
                if(alt[i] > alt[i+1]){
                    int k = alt[i];
                    alt[i] = alt[i+1];
                    alt[i] = k;
                    hasSwapped = true;
                }
            }
        }

        for(int i=0;i<heights.length;i++){
            if(heights[i] != alt[i]) swapped++;
        }

        return swapped;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] heights = {5,1,2,3,4};
        bubbleSort.heightChecker(heights);
    }
}
