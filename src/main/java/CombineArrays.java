
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            combined[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            combined[arr1.length + i] = arr2[i];
        }

        return combined;
    }
}
