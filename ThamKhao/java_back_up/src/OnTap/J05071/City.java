package OnTap.J05071;

public class City {
    private String cityID, cityName;
    private int fee;

    public City(String cityID, String cityName, String fee) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.fee = Integer.parseInt(fee);
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
