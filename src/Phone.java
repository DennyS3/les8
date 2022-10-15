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
        System.out.println("Звонит " + name + " " + number);
    }

    public void receiveCall() {
        System.out.println("Звонит " + this.name + " " + getNumber());
    }

    public void output() {
        System.out.println("number: " + this.number + " Model: " + this.model + " Weight: " + this.weight + " гр");
    }
    public void sendMessage(String... number){
        for (String i : number) {
            System.out.println("отправлено сообщение на номер: "+getNumber());
        }
    }
}
      /*  Основное задание
        1. Класс Phone.

        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
        звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
        возвращает номер телефона. Вызвать эти методы для каждого из
        объектов.
        Добавить конструктор в класс Phone, который принимает на вход три
        параметра для инициализации переменных класса - number, model и
        weight.
        Добавить конструктор, который принимает на вход два параметра для
        инициализации переменных класса - number, model.
        Добавить конструктор без параметров.
        Вызвать из конструктора с тремя параметрами конструктор с двумя.
        Добавьте перегруженный метод receiveCall, который принимает два
        параметра - имя звонящего и номер телефона звонящего. Вызвать этот
        метод.
        Создать метод sendMessage с аргументами переменной длины. Данный
        метод принимает на вход номера телефонов, которым будет отправлено
        сообщение. Метод выводит на консоль номера этих телефонов.*/