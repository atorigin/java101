class EmployeeTest {
    public static void main(String[] args) {
        // �i�ܫʸ�

        Employee emp = new Employee();

        // �]�w���u�s��
        emp.setEmpno(7001);
        // �]�w���u�ʺ�
        emp.setEname("king");
        // �]�w���u�a�}
        emp.setAddr("Taipei");
        
        // ���X���u�s��
        System.out.println(emp.getEmpno());
        // ���X���u�ʺ�
        System.out.println(emp.getEname());
        // ���X���u�a�}
        System.out.println(emp.getAddr());
    }
}