public class LinearSearchExample {
    public static int linearSearch(int[] data, int key) {

        for(int i = 0; i < data.length; i++)
        if(data[i] == key)
                return i;

        return -1;
        
    }

    public static void verify(int index) {
        if(index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found in list");
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        int result = linearSearch(numbers, 12);
        verify(result);

        result = linearSearch(numbers, 6);
        verify(result);
    }
    
}