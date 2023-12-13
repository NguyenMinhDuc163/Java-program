import java.util.*;
import java.util.stream.Collectors;
class Employee {
    private String idx, name, position, salaryCoefficient, idCode;
    private static int GD = 0, TP = 0, PP = 0;

    public String getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public String getIdCode() {
        return idCode;
    }

    public Employee(String idx, String name) {
        this.idx = idx;
        this.name = name;
        setProfile();
        countPosion();
    }
    public void setProfile(){
        position = idx.substring(0,2);
        salaryCoefficient = idx.substring(2,4);
        idCode = idx.substring(4);
    }
    public void countPosion(){
        if(position.equals("GD")) GD++;
        if(position.equals("TP")) TP++;
        if(position.equals("PP")) PP++;
    }

    public static int getGD() {
        return GD;
    }

    public static int getTP() {
        return TP;
    }

    public static int getPP() {
        return PP;
    }

    public Employee() {
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String toString(){
        return String.format("%s %s %s %s", name, position, idCode, salaryCoefficient);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, ArrayList<Employee>> employees = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String []s = sc.nextLine().split("\\s+");
            String idx = s[0]; String name = Arrays.stream(s, 1, s.length).collect(Collectors.joining(" "));
            Employee x = new Employee(idx, name);
            if(Employee.getGD() > 1 && x.getPosition().equals("GD")) x.setPosition("NV");
            if(Employee.getTP() > 3 && x.getPosition().equals("TP")) x.setPosition("NV");
            if(Employee.getPP() > 3 && x.getPosition().equals("PP")) x.setPosition("NV");
            employees.putIfAbsent(x.getPosition(), new ArrayList<>());
            employees.get(x.getPosition()).add(x);
        }

        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String positon = sc.nextLine();
            employees.get(positon).stream().sorted((x, y) -> {
                if(!Objects.equals(x.getSalaryCoefficient(), y.getSalaryCoefficient()))
                    return y.getSalaryCoefficient().compareTo(x.getSalaryCoefficient());
                else return x.getIdCode().compareTo(y.getIdCode());
            }).forEach(System.out::println);
        }
    }
}
