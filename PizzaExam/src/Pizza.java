
public class Pizza extends Circle{     // Circle�� ��ӹ���
    private String name;// name ���� private���� ����

    
    // name�� size�� �ʱ�ȭ��Ű�� ������
    // super ���
    public Pizza(int size, String name) {
    	super(size);
    	this.name = name;
    }

@Override
public String toString() {

return "������ ����:" + name + ", ������ ũ��:" + size;
}



}
