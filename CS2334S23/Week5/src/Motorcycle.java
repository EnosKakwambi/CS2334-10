
// Child class for motorcycles
class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
    }
}

