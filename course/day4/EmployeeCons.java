public class EmployeeCons {
    public int empno;
    public String ename;
    

    // �@�ŧi�o�� constructor�A java �|�����Ϊ� constructor �R��
    public EmployeeCons(int empno , String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    // overloading constructor�A�ҥH�p�G�ŧi��L constructor ����A�ٷQ�n�����Ϊ� constructor�A�n�A��ʼg�@���[�W�h
    public EmployeeCons(){};

    public static void main(String[] args) {

        // ���F�n��������Ϊ��غc�l�A�n���`�N line 13 �n�ŧi 
        EmployeeCons emp0 = new EmployeeCons(); // �p�G�S�� line 13�A�sĶ�|�X��
        System.out.println(emp0.empno); // 0 - �ƭȭ�l���O java �w�]�|�� 0
        System.out.println(emp0.ename); // null - ����Ѧҫ��O java �w�]�|�� null

        // �եβĤ@�ӫغc�l
        EmployeeCons emp1 = new EmployeeCons(7001, "King");
        System.out.println(emp1.empno);
        System.out.println(emp1.ename);

        // �H�U�ѼƧ� String ��e���Aint ��᭱�|�o�{�䤣�� Constructor�A�sĶ�|�X���C
        // �o�{�G�ǰѼƶ��Ƿ|�v�T
        // EmployeeCons emp2 = new EmployeeCons("King2", 7002);
    }
}
