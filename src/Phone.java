abstract public class Phone {
    public String name;
    public String number;
    public String model;
    public double weight;

    public Phone() {
    }

    public void Number() {
    }

    public void Model() {
    }

    public void weight() {
    }

    public void Phone1(String model, String number, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return this.number;
    }

    public void receiveCall(String name, String number) {
        System.out.println("������ " + name + " " + number);
    }

    public void receiveCall() {
        System.out.println("������ " + this.name + " " + getNumber());
    }

    public void output() {
        System.out.println("number: " + this.number + " Model: " + this.model + " Weight: " + this.weight + " ��");
    }
    public void sendMessage(String... number){
        for (String i : number) {
            System.out.println("���������� ��������� �� �����: "+getNumber());
        }
    }
}
      /*  �������� �������
        1. ����� Phone.

        �������� ��� ���������� ����� ������.
        �������� �� ������� �������� �� ����������.
        �������� � ����� Phone ������: receiveCall, ����� ���� �������� � ���
        ���������. ������� �� ������� ��������� ������� {name}�. getNumber �
        ���������� ����� ��������. ������� ��� ������ ��� ������� ��
        ��������.
        �������� ����������� � ����� Phone, ������� ��������� �� ���� ���
        ��������� ��� ������������� ���������� ������ - number, model �
        weight.
        �������� �����������, ������� ��������� �� ���� ��� ��������� ���
        ������������� ���������� ������ - number, model.
        �������� ����������� ��� ����������.
        ������� �� ������������ � ����� ����������� ����������� � �����.
        �������� ������������� ����� receiveCall, ������� ��������� ���
        ��������� - ��� ��������� � ����� �������� ���������. ������� ����
        �����.
        ������� ����� sendMessage � ����������� ���������� �����. ������
        ����� ��������� �� ���� ������ ���������, ������� ����� ����������
        ���������. ����� ������� �� ������� ������ ���� ���������.*/