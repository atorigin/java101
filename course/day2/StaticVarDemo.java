// �ϥ� Item Class �ͦ�����A���� static �ܼƻP�D static �ܼƮt��
public class StaticVarDemo {

    public static void main(String[] args) {

        // �ͦ���Ӱӫ~����A�C�� item ���b�@�}�l�O price1 = 100�Aprice2 = 200
        Item item1 = new Item();
        Item item2 = new Item();

        // static ���ܼ� - �ק� item1 �� price1 �� 150
        item1.price1 = 150;
        System.out.println(item1.price1);
        // ���L item2 �� price1�A�|�o�{�s item2 ���Q���ܤF
        System.out.println(item2.price1);

        // �D static ���ܼ� - �ק� item1 �� price2 �� 250
        item1.price2 = 250;
        System.out.println(item1.price2);
        // ���L item2 �� price2�A�|�o�{�S����
        System.out.println(item2.price2);

        // �H�W�i���Aitem1 �P item2 �� price1 �ݩʨ��O���V�O���骺�P�@�� address


        // �H�W����n���g�k�O�Q�� Class �Ӫ����� price ���ާ@�A�Ҧp
        // �]���ڭn�� price1�A���D���|�v�T������ item ����A�ҥH������ Item ���O�h�ק� price1
        
        // �����O�ק�A���� item1 �� item2 ����ާ@
        Item.price1 = 300;

        // ���L item1 ����M item2 ���� price1 ��
        System.out.println(item1.price1);
        System.out.println(item2.price1);
    }
}
