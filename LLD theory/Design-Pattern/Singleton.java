/*

Design pattern to make sure only one instance of object should be created

*/

class Singleton{


    private static Singleton instance;

    private Singleton(){}

    public Singleton getInstance(){

        if(instance == null)
          instance = new Singleton();

        return instance;
    }

    public void info(){
       sout("hi");
    }

}


class Main{

    psvm(){

        Singleton ssg = Singleton.getInstance();
        ssg.info();

         Singleton ssg1 = Singleton.getInstance();
        ssg1.info();

        //ssg and ss1 same object
         System.out.println(ssg == ssg1);
    }
}