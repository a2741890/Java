package com.company;

public class Car extends Vehicle {
    private String steering;
    private String changingGears;
    private int movingSpeed;

    @Override
    public void wheretouse(String whereToUse) {
        super.wheretouse("On the racing area");
    }
public  void movingspeed(int speed){
        super.thehighestspeed(speed); //會返回上一個class呼叫該方法
        thehighestspeed(speed); //會直接用此頁的override
    //上面兩個比較
}
    @Override
    public void thehighestspeed(int theHighestSpeed) {
        System.out.println("The override is called.");
        super.thehighestspeed(theHighestSpeed);

    }

    //全部合再一起初始化(已知的就給數值 並且把參數刪去)
    public Car(String steering, String changingGears, int movingspeed) {
        super("OnTheGround", 200, 8, "Gasoline");
        this.steering = steering;
        this.changingGears = changingGears;
        this.movingSpeed = movingspeed;
    }

    private void steering(String sterring){
        System.out.println("The car has " + sterring + " sterring.");
    }


}
