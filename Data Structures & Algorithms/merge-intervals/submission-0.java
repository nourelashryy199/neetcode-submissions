class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> finalIntervals = new ArrayList<>();

        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= currentEnd) {

                currentEnd = Math.max(currentEnd, intervals[i][1]);

            } else {

                finalIntervals.add(new int[]{currentStart, currentEnd});

                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }

        finalIntervals.add(new int[]{currentStart, currentEnd});

        return finalIntervals.toArray(new int[finalIntervals.size()][]);
    }
}