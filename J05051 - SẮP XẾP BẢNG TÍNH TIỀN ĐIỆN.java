import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashMap;

class Problem {
    private String code, type;
    private long idxOld,idxNew, intoMoney, difference, total;
    private int coeff;
    private static HashMap<String, Integer> typeSD = new HashMap<>();

    public Problem(int code, String  type, long idxOld, long idxNew) {
        this.code = String.format("KH%02d", code);
        this.type = type;
        this.idxOld = idxOld;
        this.idxNew = idxNew;
        typeSD.put("KD", 3);typeSD.put("NN", 5);
        typeSD.put("TT", 4);typeSD.put("CN", 2);
        this.coeff = typeSD.get(type);
        this.intoMoney = (idxNew - idxOld) * coeff * 550;
        if(idxNew - idxOld < 50) difference = 0;
        else if(idxNew - idxOld <= 100) difference = Math.round((double) intoMoney / 100 * 35);
        else difference = intoMoney;
        this.total = intoMoney + difference;
    }

    public long getTotal() {
        return total;
    }

    public String toString(){
        return String.format("%s %d %d %d %d", code, coeff, intoMoney, difference, total) ;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        ArrayList<Problem> a = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            sc.nextLine();
            a.add(new Problem(i, sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        a.sort((x, y) -> Long.compare(y.getTotal(), x.getTotal()));
        a.forEach(System.out::println);
    }
}
