public class circle { public int radius;

    public circle() {
        radius = 5;
    }

    public circle(int r, int x) {
        radius = r;

}
public double Calculatecircumference() {
        return (2 * 3.14 * radius);
    }
}

  class circlerun{
    public static void main(String args[]) {

        circle c = new circle();
        System.out.println(c.Calculatecircumference());

        circle c1 = new circle(10, 20);
           System.out.println(c1.Calculatecircumference());
    }
}
