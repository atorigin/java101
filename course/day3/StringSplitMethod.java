public class StringSplitMethod {
    public static void main(String[] args) {
        String str = "That-is-a-pen";
        String[] arrStr = str.split("[-]+");

        for (int i =0 ; i < arrStr.length ; i++ ) {
            System.out.println(arrStr[i]);
        }

        // ���j�u
        System.out.println("=====================================");
        
        // ���� str �� - �Ÿ����h�ֳ����v�T��X
        String str1 = "That------------is-----a-pen";
        String[] arrStr1 = str1.split("[-]+"); // + �N����N�h�ӡA�o��N�O���N�h�� - �Ÿ�

        for (int i = 0; i < arrStr1.length; i++) {
            System.out.println(arrStr1[i]);
        }
    }
}
