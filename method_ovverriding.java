class Bus
{
    int wheels;
    int speed;

    Bus(int wheels,int speed)
    {
        this.wheels = wheels;
        this.speed = speed;
    }
    void down()
    {
        speed = speed - 1;
    }
    void details()
    {
        System.out.println("\n The speed of  the Bus is : "+ speed + "\nNumber of wheels in the Bus is  " + wheels);
    }
}
class Bike extends Bus
{
    int gear;
    Bike(int wheels,int speed,int gear)
    {
        super(wheels,speed);
        this.gear = gear;
    }
    // @Override if the method is not overriden it will give error , thsts why we should use this keyword
    void down()
    {
        speed = speed - 1;
    }
    // @Override
    void speedy()
    {
        speed +=1;
    }
    @Override
    void  details()
    {
        System.out.println("\n The speed of  the bike is : "+ speed + "\nNumber of wheels in the bike is  " + wheels );
    }

}
class method_ovverriding
{
    public static void main(String args[])
    {
        Bus obj1 = new Bus(4,15);
        obj1.down();
        obj1.details();
        Bike obj2 = new Bike(2,3,4);
        obj2.down();
        obj2.details();
        obj1 = obj2;
        obj1.details();
        // obj1.speedy(); This error because "it is the type of reference variable" that will determine what memebers can be accessed
        // subclass object is assigned to a superclass reference variable so we can access only those parts of the object defined by the superclass
    }
}
// The most important part is that A superclass reference variable can reference a subclass object;