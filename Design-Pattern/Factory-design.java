/*

This design patter is about creating a product from factory, that it

Now u will find u kind of implements: 

1: simple factory
2: real factory



Requirement :

Purpose: Creates objects without exposing the instantiation logic to the client.
Use Cases: Creating different types of database connections, UI elements, or parsing objects.

good place : https://refactoring.guru/design-patterns/factory-method


now people use both, and u cant debate them, as they will say first is right whats wrong here. I had made a wrapper class for constructor call. 

code :
*/

//----------------------simple factory-------------------------------------------

interface Vehicle {
    void printVehicle();
}

class TwoWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

class VehicleFactory {
    public static Vehicle createVehicle(int type) {
        if(type==1)
          return new TwoWheeler();
        else if(type==2)
          return FourWheeler();
        else
         return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.createVehicle(1);
        v1.printVehicle();

        Vehicle v2 = VehicleFactory.createVehicle(2);
        shape2.printVehicle();
    }
}


//--------------------------------------------Real factory---------------------

interface Vehicle {
    void printVehicle();
}

class TwoWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler implements Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

// Factory Interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete Factory for TwoWheeler
class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

// Concrete Factory for FourWheeler
class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}


// Driver program
public class Main{
    public static void main(String[] args) {
      
        int type = 2 ;
        Vehicle pVehicle;
        VehicleFactory vfactory;
      
        if(type==1)
          vfactory = new TwoWheelerFactory();
        else if(type==2)
          vfactory = new FourWheelerFactory();
        else
          vfactory = null;
       
        //create factory here
        pVehicle = vfactory.createVehicle();
        
        //the product is here
        pVehicle.printVehicle();
       
    }
}








