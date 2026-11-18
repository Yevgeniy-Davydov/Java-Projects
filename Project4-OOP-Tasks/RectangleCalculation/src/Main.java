


public class Main {
    public static void main(String[] args) {

        Rectangle newTestClass = new Rectangle(4.0, 3.0);
        System.out.printf("Rechteck %.1f X %.1f %n", newTestClass.getWidth(), newTestClass.getHight());

        System.out.printf("Flaeche: %.1f %n", newTestClass.calcArea());
        System.out.printf("Umfang: %.1f %n", newTestClass.calcPerimeter());
        System.out.println(" ");

        // scale with factor 2.0

        newTestClass.scale(2.0);
        System.out.printf("Rechteck %.1f X %.1f %n", newTestClass.getWidth(), newTestClass.getHight());
        System.out.printf("Flaeche: %.1f %n", newTestClass.calcArea());
        System.out.printf("Umfang: %.1f %n", newTestClass.calcPerimeter());
        System.out.println(" ");

        //failures
        Rectangle newTestClass2 = new Rectangle(-4.0, 3.0);
        System.out.printf("Rechteck 2 %.1f X %.1f %n", newTestClass2.getWidth(), newTestClass2.getHight());
        newTestClass2.scale(-2);











    }
}