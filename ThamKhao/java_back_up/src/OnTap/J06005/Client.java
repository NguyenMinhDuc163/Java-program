package OnTap.J06005;

public class Client {
    private String clientID, clientName, sex, birth, address;

    public Client(String clientID, String clientName, String sex, String birth, String address) {
        this.clientID = clientID;
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
