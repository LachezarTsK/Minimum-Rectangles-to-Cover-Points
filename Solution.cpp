
#include <ranges>
#include <vector>
using namespace std;

class Solution {

public:
    int minRectanglesToCoverPoints(vector<vector<int>>& points, int maxDistanceBewteenPointsAt_x_axis) const {
        ranges::sort(points);
        int countRectangles = 0;
        int index = 0;

        while (index < points.size()) {
            int x = points[index][0];
            while (index < points.size() && points[index][0] - x <= maxDistanceBewteenPointsAt_x_axis) {
                ++index;
            }
            ++countRectangles;
        }
        return countRectangles;
    }
};
