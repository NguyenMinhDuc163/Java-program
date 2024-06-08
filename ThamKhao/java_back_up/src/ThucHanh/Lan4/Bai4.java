package ThucHanh.Lan4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Team{
    private String  teamName, code, schoolName;

    public Team(String teamName, String code, String schoolName) {
        this.teamName = teamName;
        this.code = code;
        this.schoolName = schoolName;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return  teamName + " " + schoolName;
    }
}
public class Bai4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        HashMap<String, String> school = new HashMap<>();
        ArrayList<Team> teams = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String []s = sc.nextLine().trim().split("\\s+", 2);
            school.put(s[0], s[1]);
        }
        sc = new Scanner(new File("REGISTER.in"));
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String []s = sc.nextLine().trim().split("\\s+");
            for(int j = 1; j <= Integer.parseInt(s[1]); j++){
                String name = sc.nextLine();
                teams.add(new Team(name, s[0], school.get(s[0])));
            }
        }
        teams.sort(Comparator.comparing(Team::getSchoolName).thenComparing(Team::getTeamName));
        for(int i = 0; i < teams.size(); i++){
            System.out.printf("team%02d ", i + 1);
            System.out.println(teams.get(i));
        }
    }
}
