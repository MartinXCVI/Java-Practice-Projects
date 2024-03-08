public class Stock {
    private int shares;
    private double price;
    private double capital;

    public void buy(double priceNum, int sharesNum) {
        shares += sharesNum;
        price = priceNum;
        capital += sharesNum * priceNum;
    }

    public void sell(double priceNum, int sharesNum) {
        shares -= sharesNum;
        price = priceNum;
        capital -= sharesNum * priceNum;
    }

    public int getShares() {
        return shares;
    }

    public double getPrice() {
        return price;
    }

    public double getAveragePrice() {
        return capital / getShares();
    }
}