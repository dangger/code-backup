public class Demo {
    public static void main(String[] args){
        // ������Student
        class Student{  // ͨ��class�ؼ����ඨ����
            // ������ı���
            String name;
            int age;
            float score;

            // ������ĺ���
            void say(){
                System.out.println( name + "�������� " + age + "���ɼ��� " + score );
            }
        }

        // ͨ�������������������������
        Student stu1 = new Student();  // ����ʹ��new�ؼ���
        // ������ĳ�Ա
        stu1.name = "С��";
        stu1.age = 15;
        stu1.score = 92.5f;
        stu1.say();
    }
}