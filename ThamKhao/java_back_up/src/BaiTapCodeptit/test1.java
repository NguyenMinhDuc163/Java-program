package BaiTapCodeptit;

import java.util.Objects;

class Students{
    private String idx, name;

    public Students(String idx, String name) {
        this.idx = idx;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.join(" ", idx, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return Objects.equals(idx, students.idx) && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idx, name);
    }
}

public class test1 {
    public static void main(String[] args) {
        Students student1 = new Students("a", "bb");
        Students student2 = new Students("a", "bb");
        System.out.println(student1.equals(student2));
    }
}