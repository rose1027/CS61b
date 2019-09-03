public class TestSort {

    /*test the selectionsort.sort method*/
    public static void testsort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        ss.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    /*Test the selectionsort.findSmallest method*/
    public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";
        // selectionsort ss = new selectionsort();
        String actual = ss.FindSmallest(input);
        org.junit.Assert.assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        selectionsort ss = new selectionsort();
        testFindSmallest();
    }
}
