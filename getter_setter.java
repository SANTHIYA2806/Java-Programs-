package pack_2;
import pack_1.*;

class Sri {
    private String place;
    private int age;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Incorrect Age");
        }
    }
}
public class getter_setter {
    public static void main(String[] args) {
        Sri s = new Sri();
        s.setPlace("Erode");
        s.setAge(20);
        System.out.println(s.getPlace());
        System.out.println(s.getAge());
    }
}
