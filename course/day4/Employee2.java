public class Employee2 {
    private int empno;
    private String ename;
    
    // �غc�l
    public Employee2 (int empno, String ename){
        this.empno = empno;
        this.ename = ename;
    }
    
    // overloaded constructor
    public Employee2(){};
    
    // �ʸ�
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
        System.out.println("���u�s�� = " + empno); // �]�i�H + this
        System.out.println("���u�m�W = " + ename);
    }
}
