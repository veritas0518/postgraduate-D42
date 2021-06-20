import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the coordinates of p21:");
        double x = s.nextDouble();
        double y = s.nextDouble();
        Point2D p21 = new Point2D(x,y);
        Point2D p22 = new Point2D();
        System.out.println("* p21 *");
        System.out.println("* "+p21.getDistance());
        System.out.println("* "+p21.isZero());
        System.out.println("* "+p22.isZero());
        System.out.println("* "+p21.equals(p22));
        System.out.println("Please enter the coordinates of p31:");
        x=s.nextDouble();
        y=s.nextDouble();
        double z =s.nextDouble();
        Point3D p31 =new Point3D(x,y,z);
        Point3D p32 =new Point3D();
        System.out.println("* p31 *");
        System.out.println("* "+p31.getDistance());
        System.out.println("* "+p31.isZero());
        System.out.println("* "+p31.isZero());
        System.out.println("* "+p31.equals(p32));



    }
}
class Point2D{
        protected double x, y;
        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point2D() {
            this(0, 0);
        }
        //返回坐标形式的字符串
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
        //判断两个二维点是否重合
        public boolean equals(Point2D p) {
            return x == p.x && y == p.y;
        }
        //求到原点距离
        public double getDistance() {
            return Math.sqrt(x * x + y * y);
        }
        //判断是否是原点
        public boolean isZero() {
            return getDistance() == 0;
        }
}
class Point3D extends Point2D{
    protected double z;
    public Point3D(double x, double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D() {
        this(0, 0, 0);
    }

    public String toString() {
        return "(" + x + ", " + y + "," + z + ")";
    }

    public boolean equals(Point3D p) {
        return x == p.x && y == p.y && z == p.z;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public boolean isZero() {
        return getDistance() == 0;
    }

}
