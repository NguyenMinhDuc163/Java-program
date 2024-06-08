package ThucHanh.Lan2;
import java.io.*;
import java.util.*;
class User{
    private String userName, passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(userName, user.userName) && Objects.equals(passWord, user.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, passWord);
    }
}
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<User, Integer> mp = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            User user = new User(sc.next(), sc.next());
            mp.put(user, 0);
        }
        int m = sc.nextInt();
        for(int i = 1; i <= m; i++){
            User user = new User(sc.next(), sc.next());
            if(mp.containsKey(user))
                mp.put(user, mp.get(user) + 1);
        }
        mp.forEach((key, value) -> System.out.print(value + " "));
    }
}
