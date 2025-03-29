/*

Hi, Learn and understand the theory of SOLID principle, 

why ?
computer engineering is art, and as an artist, we should know some correct ways to make our art beyond this world.

in OOP based world, we try to connect with real world, observe and understand and then try to solve the problem, using some guidance like :

1) S   

Its called single responsibility, 

Now image u have class

Employee {

            managePay();

            handleReports();

            connectDatabase();

}


Now this Employee has 3 methods, but if u see they all share different kind of responisibility. One fine day if someone want to make changes, to handleReport method, it would effect ur entire Employee 
so as other methods. So such approch could impact a lot in future.


FIX : 

seprate out the responsibility

class PayrollManager{
}

class DatabaseConnector {
}

class ReportManager {

}


-------------------------------------------------------
2) O

Open to extention close to modification.

Imagine u have a 
class AreaCalculator{

 public int getArea(Shape shape){
    
    if(shape instanceOf Circle) {
      Circle circle = (Circle) shape;
      return pi*circle.radius*circle.radius;
    }
    if(shape instanceOf Rect) {
      Rect rect = (Rect) shape;
      return rect.height*rect.width;
    }

    //what is now we want to add more shape, we need to update this place
  
  }
}


HOW TO FIX THIS ????

remove this dependecy (high coupling)

instead

interface Shape{
 double getArea();
}
----------------
class Circle implement Shape{

 double getArea(){
        return this.radius * this.radius;
 }
}
------------------
class Rect implement Shape{

double getArea(){
     return this.height * this.width;
}
----------------
class AreaCalculator(Shape shape){

public double getAreaofShape(shape){
 return shape.getArea();
}
-----------------
class UserSevice(){

 Shape circle = new Circle(3);
 Shape rect = new Rect(3,4);

 AreaCalculator arc = new AreaCalculator();

sout(arc.getAreaofShape(circle);)
sout(arc.getAreaofShape(rect);)

}
  
-----------


I : 

Interface segregration

interface should be segretared based on there job


}
 

}





-----------------------------------------------------
3) L







----------------------------------------------------------------------
4) I





------------------------------------------------------------------------
5) D












*/