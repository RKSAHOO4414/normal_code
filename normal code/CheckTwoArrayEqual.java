//Java Program to check if two arrays are Equal
class ArrayEqual
{
	public static void main(String args[]) {
        int[] myFirstArray = { 12, 42, 34, 19 };
        int[] mySecondArray = { 12, 42, 34, 19 };
        int[] myThirdArray = { 12, 42, 33, 19 };

        if (checkEqual(myFirstArray, mySecondArray)) {
            System.out.println("Array are equal");
        } else {
            System.out.println("Array not equal");
        }

        if (checkEqual(myFirstArray, myThirdArray)) {
            System.out.println("Array are equal");
        } else {
            System.out.println("Array not equal");
        }

    }

    // Custom Method
    public static boolean checkEqual(int[] array1, int[] array2) {
        // Check length
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
        }

        return true;
    }

}
/*2. Using equals() method of java.util.Arrays library The similar can be achieved with equals() method from java.util.Arrays library. You can pass any two array of same data type and the method will true if the arrays are equal and false for non equality.
public class ArrayEqual {

    public static void main(String args[]) {
        int[] myFirstArray = { 12, 42, 34, 19 };
        int[] mySecondArray = { 12, 42, 34, 19 };
        int[] myThirdArray = { 12, 42, 33, 19 };

        System.out.println(Arrays.equals(myFirstArray, mySecondArray));
        System.out.println(Arrays.equals(myFirstArray, myThirdArray));

    }
}*/