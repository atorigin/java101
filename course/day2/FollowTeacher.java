public class FollowTeacher {

    // �sĶ����
    // int i;
    // int j = i + 1;
    
    // �sĶ OK
    static int i ;
    static int j = i + 1;
    public static void main(String[] args) {

        // method ���ϰ��ܼƨS�����w��l�ȡA j �ե� i �ɷ|�X��
        // int i ;
        // int j = i + 1;

        // int i = 0;
        // int j = i + 1;
        System.out.println("i = " + i); // �Y�f�t 4,5 ��A�sĶ�|�X���A�]�� static ��k�I�s����ɴ��������ܼ�
        System.out.println("j = " + j); // �Y�f�t 4,5 ��A�sĶ�|�X���A�]�� static ��k�I�s����ɴ��������ܼ�

        // �� HelloWorld �� new �@�ӹ��� (�� instance �I�s)
        FollowTeacher xx = new FollowTeacher();
        System.out.println("xx.i = " + xx.i);
        System.out.println("xx.j = " + xx.j);

        // �ڥ����Υͦ����� (�� class �I�s)
        System.out.println("FollowTeacher.i" + FollowTeacher.i);
        System.out.println("FollowTeacher.j" + FollowTeacher.j);
    }
}
