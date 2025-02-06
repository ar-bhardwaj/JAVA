class Demo {
    Demo(String name, int Price) {
        this(Price);
        System.out.println("Name: " + name);
    }

    Demo(int price) {
        this("Honda");
        System.out.println("Price is: " + price);
    }

    Demo(String brand) {
        System.out.println("Brand is: " + brand);
    }
}

class Truck extends Demo {
    Truck(int Price) {
        super(Price);
        System.out.println("Truck price is : " + Price);
    }

    Truck(String name, int price) {

        this(price);

        System.out.println("Name: " + name);
    }

    Truck(double speed) {
        this(900);
        System.out.println("Speed is : " + speed + "perKM");
    }
}

class DemoClass {
    public static void main(String[] args){
       // Demo d = new Demo("BMW",700000);
        Truck t = new Truck("Ashok",1700);
    }
}