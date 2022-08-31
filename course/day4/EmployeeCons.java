public class EmployeeCons {
    public int empno;
    public String ename;
    

    // 一宣告這個 constructor， java 會把隱形的 constructor 刪除
    public EmployeeCons(int empno , String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    // overloading constructor，所以如果宣告其他 constructor 之後，還想要有隱形的 constructor，要再手動寫一次加上去
    public EmployeeCons(){};

    public static void main(String[] args) {

        // 為了要能夠用隱形的建構子，要先注意 line 13 要宣告 
        EmployeeCons emp0 = new EmployeeCons(); // 如果沒有 line 13，編譯會出錯
        System.out.println(emp0.empno); // 0 - 數值原始型別 java 預設會給 0
        System.out.println(emp0.ename); // null - 物件參考型別 java 預設會給 null

        // 調用第一個建構子
        EmployeeCons emp1 = new EmployeeCons(7001, "King");
        System.out.println(emp1.empno);
        System.out.println(emp1.ename);

        // 以下參數把 String 放前面，int 放後面會發現找不到 Constructor，編譯會出錯。
        // 發現：傳參數順序會影響
        // EmployeeCons emp2 = new EmployeeCons("King2", 7002);
    }
}
