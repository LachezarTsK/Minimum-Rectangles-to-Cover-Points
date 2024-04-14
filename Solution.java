
import java.util.Arrays;

public class Solution {

    public int minRectanglesToCoverPoints(int[][] points, int maxDistanceBewteenPointsAt_x_axis) {
        Arrays.sort(points, (x, y) -> x[0] - y[0]);
        int countRectangles = 0;
        int index = 0;

        while (index < points.length) {
            int x = points[index][0];
            while (index < points.length && points[index][0] - x <= maxDistanceBewteenPointsAt_x_axis) {
                ++index;
            }
            ++countRectangles;
        }
        return countRectangles;
    }
}
