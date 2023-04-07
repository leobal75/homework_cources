public abstract class Transport {
    private String name_of_model;
    private String price;
    private int capacity;
    public Transport(String name_of_model, String price, int capacity) {
        this.name_of_model = name_of_model;
        this.price = price;
        this.capacity = capacity;
    }
    public String toString(){
        return name_of_model + " " + capacity + " " + price;
    }
    public String getName_of_model(String name_of_model){
        return name_of_model;
    }
    public String getPrice(String price){
        return price;
    }
    public int getCapacity(int capacity){
        return capacity;
    }
}