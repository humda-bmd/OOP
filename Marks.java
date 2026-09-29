public class Marks { public int mark1, mark2, mark3;

    public Marks() {
        mark1 = 50;
        mark2 = 60;
        mark3 = 70;
    }

    public Marks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
        mark3 = 80;
    }

    public int CalculateSum() {
        return (mark1 + mark2 + mark3);
    }
}

 class Marksrunner { public static void main(String args[]) {

        Marks m = new Marks();
        System.out.println(m.CalculateSum());

        Marks m1 = new Marks(80, 90);
        System.out.println(m1.CalculateSum());
    }
}


