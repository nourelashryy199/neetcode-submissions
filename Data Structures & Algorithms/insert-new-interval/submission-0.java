class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        List<int[]> finalIntervals = new ArrayList<>();

        int intervalIdx = 0;
        while (intervalIdx < intervals.length &&
               intervals[intervalIdx][1] < newStart) {

            finalIntervals.add(intervals[intervalIdx]);
            intervalIdx++;
        }
        while (intervalIdx < intervals.length &&
               intervals[intervalIdx][0] <= newEnd) {

            newStart = Math.min(newStart, intervals[intervalIdx][0]);
            newEnd = Math.max(newEnd, intervals[intervalIdx][1]);

            intervalIdx++;
        }
        finalIntervals.add(new int[]{newStart, newEnd});

        while (intervalIdx < intervals.length) {
            finalIntervals.add(intervals[intervalIdx]);
            intervalIdx++;
        }

        return finalIntervals.toArray(
            new int[finalIntervals.size()][]
        );
    }
}