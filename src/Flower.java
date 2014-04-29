import java.util.Vector;

public class Flower extends Plant, Plant implements Goods {

  protected Integer price;

    public Vector  myFlowerSet;
    public Vector  myPlant;
    public Vector  myFlowerApplication;

  public void Flower( name,  price) {
  }

  public void setPrice(Integer price) {
        if (price >= 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Not supported negative value");
    }

    public Integer getPrice() {
        return this.price;
    }

    public Flower(String name, Integer price){
        setName(name);
        setPrice(price);
    }

}
