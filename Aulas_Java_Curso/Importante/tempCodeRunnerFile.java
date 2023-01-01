/*
 * Problem Statement
You are given the ints perimeter and area. Your task is to find a triangle with the following properties:

The coordinates of each vertex are integers between 0 and 3000, inclusive.
The perimeter of the triangle must be exactly perimeter, and its area must be exactly area.

f there are multiple solutions, you may choose any of them. Return a int[] with six elements: {x1, y1, x2, y2, x3, y3}, where (x1, y1), (x2, y2), and (x3, y3) are the coordinates of the vertices of your triangle. If there is no solution, return an empty int[] instead.

Definition
Class: FindThePerfectTriangle
Method: constructTriangle
Parameters: int, int
Returns: int[]
Method signature: int[] constructTriangle(int area, int perimeter)
(be sure your method is public)

Constraints
area will be between 1 and 1,000,000, inclusive.
perimeter will be between 1 and 1000, inclusive.
 */
public class FindThePerfectTriangle {
    public int[] constructTriangle(int area, int perimeter) {
        int[] result = new int[6];
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        int i = 0;
        while (i < perimeter) {
            x1 = i;
            y1 = area - i;
            x2 = perimeter - i;
            y2 = 0;
            x3 = 0;
            y3 = i;
            if (x1 * y1 * y2 * y3 == area * perimeter / 2) {
                result[0] = x1;
                result[1] = y1;
                result[2] = x2;
                result[3] = y2;
                result[4] = x3;
                result[5] = y3;
                return result;
            }
            i++;
        }
        return result;
    }


}