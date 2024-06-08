package OnTap.J05071;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.util.Map;

public class Phone {
    private String phoneNum, callStart, callEnd;
    private City city;

    public Phone(String phoneNum, String callStart, String callEnd, City city) {
        this.phoneNum = phoneNum;
        this.callStart = callStart;
        this.callEnd = callEnd;
        this.city = city;
    }

    public Phone(String phoneNum, String callStart, String callEnd) {
        this.phoneNum = phoneNum;
        this.callStart = callStart;
        this.callEnd = callEnd;
    }

    public int solveTime(){
        LocalTime t1 = LocalTime.parse(callStart);
        LocalTime t2 = LocalTime.parse(callEnd);
        long time = ChronoUnit.MINUTES.between(t1,t2);
        return (int)time;
    }

    public int solvePrice(){
        int totalPrice = 0;
        if(phoneNum.charAt(0) == '0'){
            totalPrice = solveTime() * city.getFee();
        }
        else {
            totalPrice = (int)(Math.ceil(solveTime() /  3.0)) * 800;
        }
        return totalPrice;
    }
    @Override
    public String toString() {
        String local = "";
        int time = 0;
        if(phoneNum.charAt(0) == '0') {
            local = city.toString();
            time = solveTime();
        }
        else{
            local = "Noi mang";
            time = (int)(Math.ceil(solveTime() /  3.0));
        }
        return phoneNum + " " + local + " " +  time + " " + solvePrice();
    }
}
