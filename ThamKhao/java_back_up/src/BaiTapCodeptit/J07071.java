import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07071 {
    private static class Person implements Comparable<Person> {
        private String tenFull, vt, tenChinh;

        public Person(Scanner sc) {
            this.tenFull = sc.nextLine();
            this.vt = layVT(this.tenFull);
            this.tenChinh = layTenChinh(this.tenFull);
        }

        static String layVT(String s) {
            String[] data = s.split(" ");
            StringBuilder res = new StringBuilder();
            for (String tmp : data) {
                res.append(tmp.charAt(0)).append(".");
            }
            return res.substring(0, res.length() - 1);
        }

        static String layTenChinh(String s) {
            String[] data = s.split("\\s+");
            return data[data.length - 1];
        }

        @Override
        public String toString() {
            return this.tenFull;
        }

        @Override
        public int compareTo(Person o) {
            int result = this.tenChinh.compareTo(o.tenChinh);
            return result == 0 ? this.tenFull.compareTo(o.tenFull) : result;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Person> dsP = new ArrayList<>();
        while (t-- > 0) {
            dsP.add(new Person(sc));
        }
        Collections.sort(dsP);
        t = sc.nextInt();
        while (t-- > 0) {
            String q = sc.next();
            int k = q.indexOf("*");
            for (Person tmp : dsP) {
                if (k == -1) {
                    if (tmp.vt.equals(q)) {
                        System.out.println(tmp);
                    }
                } else if (tmp.vt.startsWith(q.substring(0, k)) && tmp.vt.endsWith(q.substring(k + 1))) {
                    System.out.println(tmp);
                }
            }
        }
    }
}
