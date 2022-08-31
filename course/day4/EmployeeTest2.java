public class EmployeeTest2 {
    // 範例邏輯
    public static void main(String[] args) {
        
        // 員工報到 - new 一個 Employee2 物件 
        Employee2 e = new Employee2(7001, "king");
        
        // 員工編號給錯，要從後台修改員工編號
        e.setEmpno(8001);
        
        // 一次性列出員工資訊
        e.display();
    }
}
