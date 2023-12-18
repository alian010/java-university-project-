public class Vehicle {
    
    private String name;
    private int currentSpeed;
    private int currentDirection;
    public Vehicle(String name){
        this.name=name;
        this.currentSpeed=0;
        this.currentDirection=0;
    }
    
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Steer method called at:"+currentDirection+" degrees.");
    }
    
    
    public void move(int speed ,int direction){
        currentDirection=direction;
        currentSpeed=speed;
        System.out.println("move methode called : Moving at "+currentSpeed+" in direction "+currentDirection);
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name= name;
    }
    
    public int getcurrentSpeed(){
        return currentSpeed;
    }
    
    public void  setcurrentSpeed(int currentSpeed){
        this.currentSpeed= currentSpeed;
    }
    public int getcurrentDirection(){
        return currentDirection;
    }
    
    public void  setcurrentDirection(int currentDirection){
        this.currentDirection= currentDirection;
    }
    
    public void stop(){
        this.currentSpeed = 0;
    }
}
