//package org.example;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//public class minPlat_test {
//    @Test
//    public void testminP(){
//        MinPlatforms minPlatformsObj = new MinPlatforms();
//
//        // Test case 1: Regular scenario with overlapping schedules
//        int[] arr1 = {900, 940, 950, 1100, 1500, 1800};
//        int[] dep1 = {910, 1200, 1120, 1130, 1900, 2000};
//        assertEquals(3, minPlatformsObj.findPlatform(arr1, dep1, 6));
//
//        // Test case 2: Regular scenario with non-overlapping schedules
//        int[] arr2 = {800, 1100, 1500, 1700, 1900};
//        int[] dep2 = {900, 1300, 1600, 1800, 2000};
//        assertEquals(1, minPlatformsObj.findPlatform(arr2, dep2, 5));
//
//        // Test case 3: Scenario with only one train
//        int[] arr3 = {1000};
//        int[] dep3 = {1200};
//        assertEquals(1, minPlatformsObj.findPlatform(arr3, dep3, 1));
//
//        // Test case 4: Scenario with no trains
//        int[] arr4 = {};
//        int[] dep4 = {};
//        assertEquals(0, minPlatformsObj.findPlatform(arr4, dep4, 0));
//    }
//
//}
