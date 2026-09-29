public class Time {  public int hr, min, seconds;

    public Time() {
        hr = 10;
        min = 30;
        seconds = 20;
    }

    public Time(int h, int m) {
        hr = h;
        min = m;
        seconds = 0;

    }

    public void display() {
        System.out.println("Hour: " + hr);
        System.out.println("Minute: " + min);
        System.out.println("Seconds: " + seconds);
    }
}

   class timerunner {
    public static void main(String args[]) {

        Time t = new Time();
          t.display();

        Time t1 = new Time(15, 45);
        t1.display();
    }

}
