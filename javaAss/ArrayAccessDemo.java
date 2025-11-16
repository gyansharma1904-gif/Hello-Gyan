// ArrayAccessDemo.java
public class ArrayAccessDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println("Accessing 10th element: " + arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Tried to access index 9 in array of length " + arr.length);
        }
    }
}



