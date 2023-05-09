public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public  boolean isOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getSLOW(){
        return this.SLOW;
    }

    public int getMEDIUM(){
        return this.MEDIUM;
    }

    public int getFAST(){
        return this.FAST;
    }

    public String toString(){
        if (this.on){
            return "Tốc độ quạt là: " + this.speed + " Màu: " + this.color + "Bán kính: " + this.radius + " Quạt đang ON ";
        } else {
            return "Màu: " + this.color + " Bán kính " + this.radius + " Quạt đang OFF ";
        }
    }
}
