
using System;

public class Solution
{
    public int MinRectanglesToCoverPoints(int[][] points, int maxDistanceBewteenPointsAt_x_axis)
    {
        Array.Sort(points, (x, y) => x[0] - y[0]);
        int countRectangles = 0;
        int index = 0;

        while (index < points.Length)
        {
            int x = points[index][0];
            while (index < points.Length && points[index][0] - x <= maxDistanceBewteenPointsAt_x_axis)
            {
                ++index;
            }
            ++countRectangles;
        }
        return countRectangles;
    }
}
