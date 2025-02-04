class students {
    int id;
    String name;
    int age;

    students(int i, String n) {
        id = i;
        name = n;
    }

    students(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    students(){
    }

    public static void main(String[] args)
    {
        students s1 = new students(111, "Sandy");
        students s2 = new students();
        s2.id = s1.id;
        s1.display();
        s2.display();
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }
}
