public class Main {
    public static void main(String[] args) {
        Stock myCompany = new Stock();

        myCompany.buy(35.7, 2000);
        myCompany.buy(38.3, 3000);
        myCompany.sell(43.8, 1000);
        System.out.println(myCompany.getShares());
        System.out.println(myCompany.getPrice());
        System.out.println(myCompany.getAveragePrice());
    }
}