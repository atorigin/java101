public class SpecialCase {

    static int i = 0; // ��b heap �O����
    // int i = 99; // �|���A�]�����ƫŧi
    static int j = i + 1;
    public static void main(String[] args) {

        // �U�����M�i�H�L�A���O���n�γo�ؼg�k�A�ܮe�����H�~�|
        int i = 99; // �i�H�ŧi�A�]���|��b stack �O����

        System.out.println("i = " + i); // �|�O�� 8 �檺 i�A�]���|�����ϰ��ܼƪ��ŧi(�p�G����ܼƩR�W�@��)
        System.out.println("j =  " + j); // ���G�� 1�A�]���O�� line5 �����浲�G

        // �U�����O 3 ~ 5 �檺���G
        SpecialCase xx = new SpecialCase();
        System.out.println("xx.i = " + xx.i);
        System.out.println("xx.j = " + xx.j);

        System.out.println("SpecialCase.i = " + SpecialCase.i);
        System.out.println("SpecialCase.j = " + SpecialCase.j);
    }
}
