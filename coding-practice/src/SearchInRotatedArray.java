public class SearchInRotatedArray {
    public int search(final int[] A, int B) {

        int start = 0;
        int end = A.length - 1;

        while(start < end){
            int mid = (start + end) / 2;

            if(A[mid] == B) return mid;

            if(A[mid] < B){
                if(A[mid] < A[end]){
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }else{
                if(A[mid] > A[start]){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public int findMinimum(int[] A){
        int start = 0;
        int end = A.length - 1;

        while (start < end){
            int mid = (start + end) / 2;

            if(A[mid] < A[end]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        SearchInRotatedArray rotatedArray = new SearchInRotatedArray();
        int[] arr = new int[]{9, 10, 11, 12, 14, 15, 17, 19, 24, 25, 30, 39, 40, 44, 46, 48, 51, 53, 54, 56, 59, 60, 69, 70, 73, 75, 80, 87, 88, 89, 92, 93, 97, 99, 104, 107, 109, 110, 111, 117, 123, 124, 125, 126, 127, 128, 135, 136, 137, 141, 148, 153, 154, 161, 166, 167, 169, 175, 177, 180, 181, 182, 185, 186, 189, 193, 198, 202, 1, 2, 6, 7};
        int output = rotatedArray.search(arr, 198);
        System.out.println(output);
    }
}
