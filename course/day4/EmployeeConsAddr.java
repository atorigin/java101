public class EmployeeConsAddr {
    public int empno;
    public String ename;
    public String addr;

    // Constructor
    public EmployeeConsAddr(){};

    public EmployeeConsAddr(int empno, String ename) {
        this.ename = ename;
        this.empno = empno;
    }

    public EmployeeConsAddr(int empno, String ename, String addr) {
        this(empno, ename);
        this.addr = addr;
    }

    public static void main(String[] args) {
        EmployeeConsAddr emp0 = new EmployeeConsAddr();
        System.out.println(emp0.empno);
        System.out.println(emp0.ename);

        // 調用第一個建構子
        EmployeeConsAddr emp1 = new EmployeeConsAddr(7001, "King");
        System.out.println(emp1.empno);
        System.out.println(emp1.ename);

        EmployeeConsAddr emp2 = new EmployeeConsAddr(7001, "King", "Taipei");
        System.out.println(emp2.empno);
        System.out.println(emp2.ename);
    }
    
}
