package com.company;

class Hamburger{
    //Constructor以外的設成protected以便於給繼承的子類使用
    private String thePackage;
    private String BreadRollType;
    private String Meat;
    //加購部分
    protected boolean Lettuce;
    protected boolean Tomato;
    protected boolean Carrot;
    protected boolean Cheese;
    //健康漢堡多加的部分
    protected boolean Olive;
    protected boolean Radish;
    //計算部分
    protected int numberofAddition;
    private double basePrice;
    protected double totalPrice;
//一鍵入訂單的漢堡後就要跑出來的東西如下 , 加料的部分是再點選的
    public Hamburger(String thePackage, String BreadRollType, String Meat, double basePrice) {
        this.thePackage = thePackage;
        BreadRollType = BreadRollType;
        Meat = Meat;
        this.basePrice = basePrice;
        }
    public String chooseMeat(int number){
        switch(number){
            case 1:
                return this.Meat = "Pork";
            case 2:
                return this.Meat = "Beef";
            case 3:
                return this.Meat = "Chicken";
            case 4:
                return this.Meat = "Fish";
        }
        return this.Meat = "error";
    }
    public String chooseBreadroll(int number){
        switch(number){
            case 1:
                return this.BreadRollType = "Honey Oat";
            case 2:
                return this.BreadRollType = "Italian";
            case 3:
                return this.BreadRollType = "Grain Wheat";
            case 4:
                return this.BreadRollType = "Flatbread";
        }
        return this.BreadRollType = "error";
    }
    public boolean addLettuce(){
        double chargeofLettuce = 2.5;
        this.totalPrice += chargeofLettuce;
        this.numberofAddition +=1;
        System.out.println("Add Lettuce" + "\n"
                +"Charging : $" +chargeofLettuce);
        return this.Lettuce = true;
    }
     public boolean addTomato(){
        double chargeofTomato = 5.0;
        this.totalPrice += chargeofTomato;
        this.numberofAddition +=1;
        System.out.println("Add Tomato" + "\n"
                +"Charging : $" +chargeofTomato);
        return this.Tomato = true;
    }
    public boolean addCarrot(){
        double chargeofCarrot = 3.5;
        this.totalPrice += chargeofCarrot;
        this.numberofAddition +=1;
        System.out.println("Add Carrot" + "\n"
                +"Charging : $" +chargeofCarrot);
        return this.Carrot = true;
    }
    public boolean addCheese(){
        double chargeofCheese = 8.0;
        this.totalPrice += chargeofCheese;
        this.numberofAddition +=1;
        System.out.println("Add Cheese" + "\n"
                +"Charging : $" +chargeofCheese);
        return this.Cheese = true;
    }

    public String Additions(boolean Lettuce, boolean Tomato, boolean Carrot, boolean Cheese) {
        if (Lettuce) {
            double chargeofLettuce = 2.5;
            this.totalPrice += chargeofLettuce;
            this.numberofAddition += 1;
            System.out.println("Add Lettuce" + "\n"
                    + "Charging : $" + chargeofLettuce);
            this.Lettuce = true;
            }
        if (Tomato) {
            double chargeofTomato = 5.0;
            this.totalPrice += chargeofTomato;
            this.numberofAddition +=1;
            System.out.println("Add Tomato" + "\n"
                    +"Charging : $" +chargeofTomato);
            this.Tomato = true;
        }
        if(Carrot){
            double chargeofCarrot = 3.5;
            this.totalPrice += chargeofCarrot;
            this.numberofAddition +=1;
            System.out.println("Add Carrot" + "\n"
                    +"Charging : $" +chargeofCarrot);
            this.Carrot = true;
        }
        if(Cheese){
            double chargeofCheese = 8.0;
            this.totalPrice += chargeofCheese;
            this.numberofAddition +=1;
            System.out.println("Add Cheese" + "\n"
                    +"Charging : $" +chargeofCheese);
            this.Cheese = true;
        }
         return "You have added additions.";
    }
    //這是一個overloading的部分
    public String Additions(String type,boolean Lettuce, boolean Tomato, boolean Carrot, boolean Cheese, boolean Olive, boolean Radish) {
        System.out.println("The addition for " + type);
        if (Lettuce) {
            double chargeofLettuce = 2.5;
            this.totalPrice += chargeofLettuce;
            this.numberofAddition += 1;
            System.out.println("Add Lettuce" + "\n"
                    + "Charging : $" + chargeofLettuce);
            this.Lettuce = true;
        }
        if (Tomato) {
            double chargeofTomato = 5.0;
            this.totalPrice += chargeofTomato;
            this.numberofAddition +=1;
            System.out.println("Add Tomato" + "\n"
                    +"Charging : $" +chargeofTomato);
            this.Tomato = true;
        }
        if(Carrot){
            double chargeofCarrot = 3.5;
            this.totalPrice += chargeofCarrot;
            this.numberofAddition +=1;
            System.out.println("Add Carrot" + "\n"
                    +"Charging : $" +chargeofCarrot);
            this.Carrot = true;
        }
        if(Cheese){
            double chargeofCheese = 8.0;
            this.totalPrice += chargeofCheese;
            this.numberofAddition +=1;
            System.out.println("Add Cheese" + "\n"
                    +"Charging : $" +chargeofCheese);
            this.Cheese = true;
        }
        if(Olive){
            double chargeofOlive = 3.0;
            this.totalPrice += chargeofOlive;
            this.numberofAddition +=1;
            System.out.println("Add Olive" + "\n"
                    +"Charging : $" +chargeofOlive);
            this.Olive = true;
        }
        if(Radish){
            double chargeofRadish = 4.0;
            this.totalPrice += chargeofRadish;
            this.numberofAddition +=1;
            System.out.println("Add Radish" + "\n"
                    +"Charging : $" +chargeofRadish);
            this.Radish = true;
        }
        return "You have added additions for your Healthy Burger.";
    }

    //收據

        public String showReceipt(){
            totalPrice += basePrice;
            System.out.println("Your bread roll type is " + this.getBreadRollType() + " with meat type " + this.getMeat());
            System.out.println("-----Receipt-----" + "\n"
                    + "Price of package : " + thePackage + " $" + basePrice + "\n"
                    +"Addition : ");
            if (Lettuce){ System.out.println("Lettuce  $2.5");}

                if (Tomato){ System.out.println("Tomato  $5");}

                    if (Carrot){ System.out.println("Carrot  $3.5");}

                        if (Cheese){ System.out.println("Cheese  $8");}

            System.out.println("\n" + "You get " + numberofAddition + " additions in total." + "\n"
                               + "Totally you need to pay : $" +totalPrice);
                           return "-----End of receipt-----";
        }

    public String getThePackage() {
        return thePackage;
    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return Meat;
    }

    public int getNumberofAddition() {
        return numberofAddition;
    }
    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
//當你要return不同東西的時候再用@override
class BasicBurger extends Hamburger{
    public BasicBurger() {
        super("BasicBurger", "Not yet.",
                "Not yet.", 10.99);
    }

    @Override
    public String Additions(boolean Lettuce, boolean Tomato, boolean Carrot, boolean Cheese) {
        return "You have added additions for your Basic Burger.";
    }
}
class HealthyBurger extends Hamburger {


    public HealthyBurger() {
        super("Healthy Burger", "Not yet.",
                "Not yet.", 13.55);

    }

    @Override
    public String showReceipt() {
        //只能夠透過overloading來把這兩樣添加在其中會比較好看
        if (Olive){ System.out.println("Olive  $3");}
        if (Radish){ System.out.println("Radish  $4");}
        //有下列這條式子就可以回傳本來的內容
        return super.showReceipt();
    }
}
class deluxeBurger extends Hamburger{
    public deluxeBurger()
    {
       super("Deluxe Burger", "Not yet.", "Not yet.", 15.99);

       //可直接繼承method super.addition();
    }
public void good(){
    System.out.println("hi");
}

//覆寫(覆蓋過去)的層級會高於父類class中method

    @Override
    public String Additions(boolean Lettuce, boolean Tomato, boolean Carrot, boolean Cheese) {
        System.out.println("Deluxe Burger can not add any addition.");
        return "";
    }

    @Override
    public String showReceipt() {
        System.out.println("Deluxe Burger is packed with Chips & Drinks!");
        return super.showReceipt();
    }
}







public class Main {
    public static void main(String[] args) {
Hamburger customer1 = new HealthyBurger();
Hamburger customer2 = new deluxeBurger();

customer1.chooseBreadroll(2);
customer1.chooseMeat(4);
customer1.Additions("Healthy Burger",true,true,true,true,true,true);
customer1.showReceipt();
customer2.chooseBreadroll(1);
customer2.chooseMeat(3);
customer2.Additions(true,false,true,false);
customer2.showReceipt();
    }

}
