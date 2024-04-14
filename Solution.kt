
class Solution {
    fun minRectanglesToCoverPoints(points: Array<IntArray>, maxDistanceBewteenPointsAt_x_axis: Int): Int {
        points.sortWith { x, y -> x[0] - y[0] };
        var countRectangles = 0;
        var index = 0;

        while (index < points.size) {
            val x = points[index][0];
            while (index < points.size && points[index][0] - x <= maxDistanceBewteenPointsAt_x_axis) {
                ++index;
            }
            ++countRectangles;
        }
        return countRectangles;
    }
}
