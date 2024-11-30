// constructor chaining: calling of one constructor from the other constructors body.
public class temp {
    //cons1
    public temp(){
        System.out.println("yeeeahhh");
    }
    //cons2
    public temp(int x){
        //calling cons1
        this();
        System.out.println(x);
    }
    //cons3
    public temp(int x,int y){//(parameters)
        //calling cons2
        this(10);
        System.out.println(x*y);
    }

    public static void main(String[] args) {
        temp tp = new temp(20, 10);//argument (20,10)
    }
}
