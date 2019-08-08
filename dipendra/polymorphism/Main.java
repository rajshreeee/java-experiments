package polymorphism;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Accelerated");
    }

    public void brake() {
        System.out.println("Braked");
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Toyota");
        super.brake();
    }
}

class Renault extends Car {
    public Renault(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Renault");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Renault");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Renault");
        super.brake();
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Tesla");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Tesla");
        super.brake();
    }
}

public class Main {
    public static void main(String args[]) {
        Toyota toyota = new Toyota(2, "Toyota Car");
        Renault renault = new Renault(1, "Renault Car");
        Tesla tesla = new Tesla(0, "Tesla Car");

        toyota.startEngine();
        renault.startEngine();
        tesla.startEngine();

        toyota.accelerate();
        renault.accelerate();
        tesla.accelerate();

        toyota.brake();
        renault.brake();
        tesla.brake();
    }
}
