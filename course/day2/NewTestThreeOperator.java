public class NewTestThreeOperator {
    public static void main(String[] args) {
        // �� 350 ���褽�ت��a�A�@���o���i�H�� 200 ���褽�ءA�հ��`�@�n�R�X���o��?
        int  area = 350, coverage = 0, count = 0;

        if (coverage > 0 && area > 0 ){
            count = area / coverage;
        }

        // �p�G area �P coverage ���l�ƭ�n = 0 �h�㰣�A�L���h�R�@���o���A�Ϥ��A�h���h�R�@���o��
        if(area > 0 && coverage > 0 && area % coverage > 0) {
            count++;
        }
        
        // �o���ƶq�j��@���h�L�ƼơA����@���L��ơC�p��@���L���ݭn�R
        if(count > 1) {
            System.out.println("Need " + count + " cans");
        } else if (count == 1) {
            System.out.println("Need " + count + " can");
        } else {
            System.out.println("Something's wrong");
        }
    }
}
