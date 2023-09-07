package uz.coder.cleanarxeticturajava.damain;

public class ShopItem {
    private String name;
    private int count;
    private int id =0;

    public ShopItem(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public ShopItem(String name, int count, int id) {
        this.name = name;
        this.count = count;
        this.id = id;
    }

    public ShopItem(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
