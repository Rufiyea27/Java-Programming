package Oops;

public class MethodOverloading {
    /*
     * same name but different parameters
     */
    public static void main(String[] args) {
        Bca obj = new Bca();
        obj.subjects();
        String result = obj.subjects("DS", "DBMS");
        System.out.println(result);

    }

}

class Mca {
    public void subjects() {
        String sub1 = "Java";
        String sub2 = "OS";
        String sub3 = "C++";
        System.out.println(sub1 + sub2 + sub3);
    }
}

class Bca extends Mca {
    public String subjects(String a, String b) {// DS DBMS

        return a + " " + b;// DS DBMS

    }
}