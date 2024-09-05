class student {
    int id;
    String name;
    int age;

    student(int i, String n) {
        id = i;
        name = n;
    }

    student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        student s1 = new student(111, "Sandy",20);
        student s2 = new student(222, "Sri",21);
        s1.display();
        s2.display();
    }
    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}
