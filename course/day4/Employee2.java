public class Employee2 {
    private int empno;
    private String ename;
    
    // 建構子
    public Employee2 (int empno, String ename){
        this.empno = empno;
        this.ename = ename;
    }
    
    // overloaded constructor
    public Employee2(){};
    
    // 封裝
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public int getEmpno() {
        return empno;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getEname() {
        return ename;
    }

    public void display () {
        System.out.println("員工編號 = " + empno); // 也可以 + this
        System.out.println("員工姓名 = " + ename);
    }
}
