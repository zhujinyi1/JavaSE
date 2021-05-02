import static java.lang.StrictMath.sqrt;

public class Fa {
    private int a;
    private int c;
    private int b;

    public Fa(int a,int b,int c) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public void gen(){
        double m = b*b-4*a*c;
        if(m<0){
            System.out.println("无解");
        }else if(m==0){
            System.out.print("有一解");
            double x = -1*b/(2*a);
            System.out.println(x);
        }else{
            System.out.println("有两根");
            double x1 = (-1*b + sqrt(m))/(2*a);
            double x2 = (-1*b - sqrt(m))/(2*a);
            System.out.println(x1+" "+x2);
        }
    }

}
