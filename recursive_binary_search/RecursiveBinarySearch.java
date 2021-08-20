public class RecursiveBinarySearch {
    public static int binarySearch(int[] input, int target) {
        return binarySearch(input, target, 0, input.length-1);
    }

    public static int binarySearch(int[] input, int target, int start, int end) {
        if(start > end){
            return -1;
        } else {
            int mid = start + (end - start) / 2;

            if (target < input[mid]) {
                return binarySearch(input, target, start, mid-1);
            } else if (target > input[mid]) {
                return binarySearch(input, target, mid+1, end);
            } else {
                return mid;
            }
        }
    }

    public static void verify(int index) {
        if(index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found in list");
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int result = binarySearch(numbers, 12);
        verify(result);

        result = binarySearch(numbers, 6);
        verify(result);
    }
}
