package reflection;

import java.lang.reflect.Method;

class sinhvien {
    private String name, birth, classRoom;

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public sinhvien() {
        // Add a default constructor
    }

    public sinhvien(String name, String birth, String classRoom) {
        this.name = name;
        this.birth = birth;
        this.classRoom = classRoom;
    }
}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> clsinhvien = Class.forName("reflection.sinhvien");
        sinhvien sv = (sinhvien) clsinhvien.newInstance();

        // Use getDeclaredMethods instead of getMethods
        Method[] methods = clsinhvien.getDeclaredMethods();
        for (Method x : methods) {
            System.out.println(x.getName());
        }
    }
}
