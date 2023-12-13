import java.io.*;
import java.util.*;
import java.text.*;

public class Main {

    static class MonThi {
        String code, name, method;

        public MonThi(String code, String name, String method) {
            this.code = code;
            this.name = name;
            this.method = method;
        }
    }

    static class CaThi {
        String code, date, time, room;

        public CaThi(int i, String date, String time, String room) {
            this.code = String.format("C%03d", i);
            this.date = date;
            this.time = time;
            this.room = room;
        }
    }

    static class LichThi {
        MonThi monThi;
        CaThi caThi;
        String code;
        int sv;
        Date date;

        public LichThi(MonThi monThi, CaThi caThi, String code, int sv) {
            this.monThi = monThi;
            this.caThi = caThi;
            this.code = code;
            this.sv = sv;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
            try {
                this.date = dateFormat.parse(caThi.date + " " + caThi.time);
            } catch (ParseException e) {

            }
        }

        @Override
        public String toString() {
            return caThi.date + " " + caThi.time + " " + caThi.room + " " + monThi.name + " " + code + " " + sv;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(new File("MONTHI.in"));
        Scanner scanner2 = new Scanner(new File("CATHI.in"));
        Scanner scanner3 = new Scanner(new File("LICHTHI.in"));
        HashMap<String, MonThi> monThiHashMap = new HashMap<>();
        HashMap<String, CaThi> caThiHashMap = new HashMap<>();
        int n = scanner1.nextInt();
        scanner1.nextLine();
        for (int i = 0; i < n; i++) {
            MonThi monThi = new MonThi(scanner1.nextLine(), scanner1.nextLine(), scanner1.nextLine());
            monThiHashMap.put(monThi.code, monThi);
        }
        int m = scanner2.nextInt();
        scanner2.nextLine();
        for (int i = 0; i < m; i++) {
            CaThi caThi = new CaThi(i + 1, scanner2.nextLine(), scanner2.nextLine(), scanner2.nextLine());
            caThiHashMap.put(caThi.code, caThi);
        }
        int k = scanner3.nextInt();
        ArrayList<LichThi> lichThiArrayList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            String caCode = scanner3.next();
            String monCode = scanner3.next();
            lichThiArrayList.add(new LichThi(monThiHashMap.get(monCode), caThiHashMap.get(caCode), scanner3.next(), scanner3.nextInt()));
        }
        lichThiArrayList.sort((x, y) -> {
            if (x.date.compareTo(y.date) == 0) return x.caThi.code.compareTo(y.caThi.code);
            return x.date.compareTo(y.date);
        });
        lichThiArrayList.forEach(e -> System.out.println(e));
    }
}
