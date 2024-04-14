
function minRectanglesToCoverPoints(points: number[][], maxDistanceBewteenPointsAt_x_axis: number): number {
    points.sort((x, y) => x[0] - y[0]);
    let countRectangles = 0;
    let index = 0;

    while (index < points.length) {
        let x = points[index][0];
        while (index < points.length && points[index][0] - x <= maxDistanceBewteenPointsAt_x_axis) {
            ++index;
        }
        ++countRectangles;
    }
    return countRectangles;
};
