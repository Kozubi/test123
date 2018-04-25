public class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static double distance(Point p1, Point p2){
        double dst = 0;
        double x_diff = p1.x - p2.x;
        double y_diff = p1.y - p2.y;
        dst = Math.pow(y_diff, 2) + Math.pow(x_diff, 2);
        dst = Math.sqrt(dst);
        return dst;
         
    }

    public static void main(String[] args){
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2345, 211);
        
        double dst = p1.distance(p1, p2);

        System.out.println("Punkt1");
        System.out.println(" \\");
        System.out.println("  \\");
        System.out.println("   \\");
        System.out.println("    \\");
        System.out.println("   " +dst);
        System.out.println("      \\");
        System.out.println("       \\");
        System.out.println("        \\");
        System.out.println("      Punkt2");
  
    }

}