public class ShirtTest {

    public static void main (String[] args) {
   
      Shirt myShirt;
      myShirt = new Shirt();
      myShirt.display();
    
      // myShirt.displayShirtInformation();
  
      // 生成第一件衣服
      Shirt s1;
      s1 = new Shirt();
      s1.shirtID = 1;
      s1.price = 100;
      s1.colorCode = 'R';
  
      s1.display();
  
      // 生成第二件衣服
      Shirt s2;
      s2 = new Shirt();
      s2.shirtID = 2;
      s2.price = 200;
      s2.colorCode = 'G';
  
      s2.display();
  
    } 
  }