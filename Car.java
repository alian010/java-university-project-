
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    
    public Car(String name,int wheels,int doors,int gears,boolean isManual,String type){
        super(name);
        this.type=type;
        this.gears=gears;
        this.doors=doors;
        this .isManual=isManual;
        this.wheels=wheels;
        currentGear=1;
        
    }
    
    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called : change to "+this.currentGear+" Gear");
        
    }
    public void changeSpeed(int newSpeed,int newDirection){
        move(newSpeed,newDirection);
        System.out.println("change speed method called : speed -> "+ newSpeed+" direction ->"+newDirection);
    }
}
