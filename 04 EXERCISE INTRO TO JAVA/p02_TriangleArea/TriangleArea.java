/*  Write a program that reads 3 points in the plane (with integer x and y as coordinates), calculates and prints the area
    of the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not
    form a triangle, print "0" as result.
*/

package p02_TriangleArea;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();
        int cX = scanner.nextInt();
        int cY = scanner.nextInt();

        int areaTriangle = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;

        System.out.println(Math.abs(areaTriangle));
    }
}
