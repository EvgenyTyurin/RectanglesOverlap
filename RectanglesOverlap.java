import java.awt.*;

/**
 * Check if to rectangles is overlap
 */

public class RectanglesOverlap {

    public static void main(String[] args) {
        // crossing rectangles
        Rectangle rect1 = new Rectangle(0, 0 , 10, 10);
        Rectangle rect2 = new Rectangle(5, 5, 10 ,10);
        System.out.println(rect1.toString() +  "\n" +
                rect2.toString() + "\n" + isOverlap(rect1, rect2)); // true
        // rect2 inside rect1
        rect1 = new Rectangle(0, 0 , 10, 10);
        rect2 = new Rectangle(1, 1, 9 ,9);
        System.out.println(rect1.toString() +  "\n" +
                rect2.toString() + "\n" + isOverlap(rect1, rect2)); // true
        // rect1 left of rect2
        rect1 = new Rectangle(0, 0 , 10, 10);
        rect2 = new Rectangle(11, 0, 10 ,10);
        System.out.println(rect1.toString() +  "\n" +
                rect2.toString() + "\n" + isOverlap(rect1, rect2)); // false
        // rect1 above of rect2
        rect1 = new Rectangle(0, 0 , 10, 10);
        rect2 = new Rectangle(0, 11, 10 ,10);
        System.out.println(rect1.toString() +  "\n" +
                rect2.toString() + "\n" + isOverlap(rect1, rect2)); // false
    }

    static boolean isOverlap(Rectangle rect1, Rectangle rect2) {
        // The rectangles DONT'T overlap if
        // one rectangle's minimum in some dimension
        // is greater than the other's maximum in
        // that dimension.
        return !(rect1.x > rect2.x + rect2.width ||
                 rect2.x > rect1.x + rect1.width ||
                 rect1.y > rect2.y + rect2.height ||
                 rect2.y > rect1.y + rect1.height);
    }

}
