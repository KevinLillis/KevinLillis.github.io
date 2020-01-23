
/**
 *
 * @author Dr. Lillis
 */
public class Coin implements Comparable {

    private int cents;
    private String name;

    public Coin(int cents, String name) {
        this.cents = cents;
        this.name = name;
    }

    public double getValue() {
        return cents;
    }

    public String getName() {
        return name;
    }

    public void setValue(int cents) {
        this.cents = cents;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[%-7s: %2d]", name, cents);
    }

    @Override
    public int compareTo(Object otherObject) {
        if (otherObject == null) {
            return -1;
        }

        if (this.getClass() != otherObject.getClass()) {
            return -1;
        }

        Coin otherCoin = (Coin) otherObject;

        // Now compare the two Coins
        // Default is to compare by the Coin's value
        if (this.cents < otherCoin.cents) {
            return -1;
        } else if (this.cents > otherCoin.cents) {
            return +1;
        } else {
            return 0;
        }
        
    }    
    
}
