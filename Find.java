class Find{

    public static int binarySearch(long[] bankCardArray, long cardNoStart) {
        int low = 0;
        int high = srcArray.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            Log.e(">>>", "binarySearch: " + srcArray[middle]);
            if (des == srcArray[middle]) {
                if (SIApplication.DEBUGMODE) Log.e(">>>", "find!: " + middle);
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
