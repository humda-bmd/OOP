public class Distance {
    public int feet, inches;

    public Distance() {
        feet = 5;
        inches = 6;
    }

    public Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    public void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}

   class distancerunner {
    public static void main(String args[]) {

        Distance d = new Distance();
        d.display();
          Distance d1 = new Distance(10, 8);
        d1.display();
    }
}


