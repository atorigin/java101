class EmployeeTest {
    public static void main(String[] args) {
        // 展示封裝

        Employee emp = new Employee();

        // 設定員工編號
        emp.setEmpno(7001);
        // 設定員工暱稱
        emp.setEname("king");
        // 設定員工地址
        emp.setAddr("Taipei");
        
        // 取出員工編號
        System.out.println(emp.getEmpno());
        // 取出員工暱稱
        System.out.println(emp.getEname());
        // 取出員工地址
        System.out.println(emp.getAddr());
    }
}