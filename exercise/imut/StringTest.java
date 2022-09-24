package exercise.imut;


/**
 * StringTest
 */

public class StringTest {
    public static void main(String[] args) {
        
        Test a = new Test("hello");
        
        System.out.println(a.getName());

        Test2 b = new Test2();

        System.out.println(b.getName());
    }
}

class Test {

    private String name;

    public Test(){};

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Test2 {
    private StringBuilder name;

    public Test2() {};

    public Test2(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getName() {
        return name;
    }
}