package virtual_pet;

public class VirtualPet {
    String name;
    double health = 100.0;
    double hunger = 75.0;
    double thirst = 50.0;
    double boredom = 50.0;
    double tiredness = 25.0;
    double waste = 15.0;

    static String[] foodMenu = {"Cheeseburger", "Tomato", "Tuna", "Fried Chicken", "Salmon", "Doritos", "Cat/Kitten Food"};
    static String[] drinksMenu = {"Coca Cola", "Sprite", "G-Fuel", "Water", "Kitten Milk"};


    public VirtualPet(String name) {
        this.name = name;
    }

    public void giveFood(String toFeed) {
        switch (toFeed) {
            case "Cheeseburger":
                this.increaseWaste(70);
                this.increaseThirst(50);
                this.increaseTiredness(30);
                this.decreaseHealth(80);
                break;

            case "Tomato":
                this.increaseWaste(10);
                this.increaseThirst(20);
                this.increaseHealth(10);
                this.decreaseHunger(40);
                break;

            case "Tuna":
                this.increaseHealth(40);
                this.increaseWaste(30);
                this.increaseThirst(20);
                this.decreaseHunger(70);
                break;

            case "Fried Chicken":
                this.increaseWaste(65);
                this.increaseTiredness(25);
                this.increaseThirst(35);
                this.decreaseHealth(70);
                break;

            case "Salmon":
                this.increaseHealth(50);
                this.increaseWaste(30);
                this.increaseThirst(15);
                this.decreaseHunger(60);
                break;

            case "Doritos":
                this.increaseWaste(50);
                this.increaseTiredness(40);
                this.increaseThirst(40);
                this.decreaseHealth(65);
                break;

            case "Cat/Kitten Food":
                this.increaseThirst(15);
                this.increaseHealth(60);
                this.increaseWaste(30);
                this.decreaseHunger(60);
                break;
        }
    }

    public void giveDrink(String toDrink) {
        switch (toDrink) {
            case "Coca Cola":
                this.increaseWaste(30);
                this.increaseTiredness(25);
                this.increaseThirst(55);
                this.decreaseHealth(30);
                break;

            case "Sprite":
                this.increaseWaste(25);
                this.increaseTiredness(35);
                this.increaseThirst(60);
                this.decreaseHealth(45);
                break;

            case "G-Fuel":
                this.increaseWaste(65);
                this.increaseTiredness(50);
                this.increaseThirst(65);
                this.decreaseHealth(80);
                break;

            case "Water":
                this.increaseWaste(10);
                this.increaseHealth(50);
                this.decreaseThirst(30);
                break;

            case "Kitten Milk":
                this.increaseWaste(40);
                this.increaseHealth(60);
                this.decreaseThirst(40);
                break;

        }
    }

    public void play() {
        this.increaseHunger(15);
        this.increaseThirst(20);
        this.increaseTiredness(50);
        this.decreaseBoredom(40);
    }

    public void takeToLitterBox() {
        this.increaseHunger(50);
        this.increaseThirst(30);
        this.decreaseWaste(100);
    }

    public void giveMedicine() {
        this.increaseHealth(100);
        this.increaseThirst(40);
        this.increaseHunger(30);
        this.increaseTiredness(60);
    }

    public void takeToTheVet() {
        this.health = 100.0;
        this.hunger = 0.0;
        this.waste = 0.0;
        this.thirst = 0.0;
        this.tiredness = 30.0;

    }

    public void sleep() {
        this.increaseHunger(20);
        this.increaseThirst(20);
        this.decreaseTiredness(100);
    }

    private void increaseHunger(double amount) {
        if (this.hunger + amount >= 100.0) {
            this.hunger = 100.0;

        } else {
            this.hunger += amount;
        }

    }

    private void decreaseHunger(double amount) {
        if (this.hunger - amount <= 0.0) {
            this.hunger = 0.0;

        } else {
            this.hunger -= amount;
        }

    }

    private void increaseThirst(double amount) {
        if (this.thirst + amount >= 100.0) {
            this.thirst = 100.0;

        } else {
            this.thirst += amount;
        }
    }

    private void decreaseThirst(double amount) {
        if (this.thirst - amount <= 0.0) {
            this.thirst = 0.0;

        } else {
            this.thirst -= amount;
        }

    }

    private void increaseWaste(double amount) {
        if (this.waste + amount >= 100.0) {
            this.waste = 100.0;

        } else {
            this.waste += amount;
        }
    }

    private void decreaseWaste(double amount) {
        if (this.waste - amount <= 0.0) {
            this.waste = 0.0;

        } else {
            this.waste -= amount;
        }

    }

    private void increaseTiredness(double amount) {
        if (this.tiredness + amount >= 100.0) {
            this.tiredness = 100.0;

        } else {
            this.tiredness += amount;
        }
    }

    private void decreaseTiredness(double amount) {
        if (this.tiredness - amount <= 0.0) {
            this.tiredness = 0.0;

        } else {
            this.tiredness -= amount;
        }

    }

    private void increaseBoredom(double amount) {
        if (this.boredom + amount >= 100.0) {
            this.boredom = 100.0;

        } else {
            this.boredom += amount;
        }
    }

    private void decreaseBoredom(double amount) {
        if (this.boredom - amount <= 0.0) {
            this.boredom = 0.0;

        } else {
            this.boredom -= amount;
        }
    }

    private void increaseHealth(double amount) {
        if (this.health + amount >= 100.0) {
            this.health = 100.0;

        } else {
            this.health += amount;
        }
    }

    private void decreaseHealth(double amount) {
        if (this.health - amount <= 0.0) {
            this.health = 0.0;

        } else {
            this.health -= amount;
        }

    }

    public void tick() {
        this.increaseThirst(1);
        this.increaseHunger(1);
        this.increaseBoredom(2);
        this.increaseTiredness(1);
    }

        public void printStats() {
        System.out.println("Stats" + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Hunger: " + this.hunger);
        System.out.println("Thirst: " + this.thirst);
        System.out.println("Boredom: " + this.boredom);
        System.out.println("Tiredness: " + this.tiredness);
        System.out.println("Waste: " + this.waste);
    

    }
}
