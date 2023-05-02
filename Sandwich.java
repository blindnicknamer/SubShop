import java.util.LinkedList;

public class Sandwich {
    private String bread;
    private boolean toasted;
    private LinkedList<String> meats = new LinkedList<String>();
    private String cheese;
    private LinkedList<String> toppings = new LinkedList<String>();
    private String sauce;

    public Sandwich(String bread, boolean toasted, String meat, String cheese, String topping, String sauce) {
        this.bread = bread;
        this.toasted = toasted;
        meats.add(meat);
        this.cheese = cheese;
        toppings.add(topping);
        this.sauce = sauce;
    }


    public String getBread() {
        return bread;
    }

    public void setBread(String b) {
        this.bread = b;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean t) {
        this.toasted = t;
    }
    
    public String checkToasted() {
    	if(toasted == true) {
    		return "toasted";
    	}
    	return "NOT toasted";
    }

    public LinkedList<String> getMeat() {
        return meats;
    }

    public void setMeat(String m) {
       this.meats.add(m);
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String c) {
        this.cheese = c;
    }

    public LinkedList<String> getToppings() {
        return toppings;
    }

    public void setToppings(String top) {
        this.toppings.add(top);
    }
    
    public String getSauce() {
        return sauce;
    }

    public void setSauce(String s) {
        this.sauce = s;
    }
    
    public String toString() {
    	return getBread() + ", " + checkToasted() + ", " + getMeat() + ", " + getCheese() + ", " + getToppings()+ ", "+ getSauce();
    }
}
