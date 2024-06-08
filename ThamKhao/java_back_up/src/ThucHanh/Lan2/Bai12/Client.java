package ThucHanh.Lan2.Bai12;

public class Client {
    private String clientID, clientName, sex, birth, address;

    public String getClientID() {
        return clientID;
    }

    public Client(int clientID, String clientName, String sex, String birth, String address) {
        this.clientID = String.format("KH%03d", clientID);
        this.clientName = clientName;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
    }

    @Override
    public String toString() {
        return clientName + " " + address;
    }
}
