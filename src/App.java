public class App {
    public static void main(String[] args) throws Exception {
        Rect r1 = new Rect(3, 3);
        r1.move(1, 1);
        Rect r2 = new Rect(3, 3);
        r2.move(2, 2);

        if (r1.isInside(r2.getCenter())) {
            System.out.println("r2 center is inside r1");
        } else {
            System.out.println("r2 center is not inside r1");
        }
    }
}
