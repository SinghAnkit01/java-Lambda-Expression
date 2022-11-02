@FunctionalInterface
public interface  myinterface {
    public abstract void name();
    // public abstract void name1();
    // public abstract void name2();
    // if we create more than one method then this interface is not the functional interface.
}

// How to access this interface
// there are multiple methods to access interface

// 1-Method
// create seperate class and implement this interface as mentioned below
//  myinterface inter = new myinterfaceImplementation();
// inter.name();

// ..................................................................

// 2-Method
// create anonymous class as mentioned below
// myinterface i = new myinterface() {

//     @Override
//     public void name() {
//        System.out.println("This is the first anonymous class");
//       }
    
// };
// i.name();
// creating second anonymous class or multiple implementation for single class.
// myinterface i2 = new myinterface(){

//     @Override
//     public void name() {
//        System.out.println("This is the Second anonymous class");
        
//     }

// };
// i2.name();

// .........................................................................

// 3-Method
// using lambda expression
// using our interface with the help of lamdba


