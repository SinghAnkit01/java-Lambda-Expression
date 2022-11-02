// import java.util.concurrent.Callable;

public class LambdaBasic {
    public static void main(String[] args) {
        System.out.println("Lambda Expression concept");
        // LambdaBasic lb = new LambdaBasic();
        // // int a, b;
        // // int c = lb.sum(a = 12, b = 12);
        // // System.out.println("addition of "+ a +" and " + b + " is " + c);
        // String ct= "Ankit";
        // int st = lb.getstring(ct);
        // System.out.println(st);

        // creating object of interface-implementation class with original interface class 
        // inter is the variable for myinterface(Parent-class) and object of myinterfaceImplementation(child-class)
        // 1-Method
        // myinterface inter = new myinterfaceImplementation();
        // inter.name();
        
        // ....................................................................

        // 2-Method
        // myinterface i1 = new myinterface() {

        //     @Override
        //     public void name() {
        //        System.out.println("This is the first anonymous class");
                
        //     }
            
        // };
        // i1.name();

    //     myinterface i2 = new myinterface(){
    //         // instead of creating 100 of different classes we can write our code in single class using interface implementation.

    //         @Override
    //         public void name() {
    //            System.out.println("This is the Second anonymous class");
                
    //         }

    //     };
    //     i2.name();

    // }

    // public int sum(int y, int z) {
    //     return (y + z);
    // }

    // ..............................................................................

    // 3-Method
    myinterface i1 = () -> {
      System.out.println("lamdba expression");
    };
    i1.name();

    myinterface i2 = () -> {
        System.out.println("lamdba expression2");
      };
      i2.name();

    // we are using functional interface by providing implementation of parent interface and accessing methods of that interface using object.method().
    
    // ............................................

    suminter si = (c,d) -> {
        // c and d is of integer type which comes from calling sum() method from suminter.java file
        return c+d ;
    };
    System.out.println(si.sum(2, 4));
    System.out.println(si.sum(5, 5));

    // ........................................
    stringLength sl = (ch) -> {
        System.out.println("Length of "+ch+ " is "+ ch.length());
        return ch.length();
        
    };
    sl.length("Ankit");
    // System.out.println(sl.length("Ankit"));


    }

    // public int getstring(String ch) {
    //     return (ch.length());
    // }

    // @Override
    // public Object call() throws Exception {
        
    //     return null;
    // }

    // @Override
    // public int compareTo(Object o) {
        
    //     return 0;
    // }

    // @Override
    // public void run() {
      
        
    // }

    // (String ct)->{
    //     return(ct.length());
    // };

    // (int y, int z) ->{
    //     return (y + z);
    // };

}
