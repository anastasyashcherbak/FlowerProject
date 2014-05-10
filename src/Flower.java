/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Flower extends Plant implements Goods{
    protected Integer price;

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
