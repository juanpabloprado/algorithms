public class IterativeBinarySearch {
    public static Integer binarySearch(int[] input, int target) {
        int first = 0;
        int last = input.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if(input[mid] == target) {
                return mid;
            } else if (input[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return null;
    }

    public static void verify(Integer index) {
        if(index != null)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found in list");
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        var result = binarySearch(numbers, 12);
        verify(result);

        result = binarySearch(numbers, 6);
        verify(result);
    }
}
