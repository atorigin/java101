// 使用 Item Class 生成物件，測試 static 變數與非 static 變數差異
public class StaticVarDemo {

    public static void main(String[] args) {

        // 生成兩個商品物件，每個 item 都在一開始是 price1 = 100，price2 = 200
        Item item1 = new Item();
        Item item2 = new Item();

        // static 的變數 - 修改 item1 的 price1 為 150
        item1.price1 = 150;
        System.out.println(item1.price1);
        // 打印 item2 的 price1，會發現連 item2 都被改變了
        System.out.println(item2.price1);

        // 非 static 的變數 - 修改 item1 的 price2 為 250
        item1.price2 = 250;
        System.out.println(item1.price2);
        // 打印 item2 的 price2，會發現沒有變
        System.out.println(item2.price2);

        // 以上可知，item1 與 item2 的 price1 屬性其實是指向記憶體的同一個 address


        // 以上比較好的寫法是利用 Class 來直接對 price 做操作，例如
        // 因為我要改 price1，知道它會影響全部的 item 物件，所以直接用 Item 類別去修改 price1
        
        // 用類別修改，不對 item1 或 item2 物件操作
        Item.price1 = 300;

        // 打印 item1 物件和 item2 物件的 price1 值
        System.out.println(item1.price1);
        System.out.println(item2.price1);
    }
}
