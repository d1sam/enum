package ua.od.atomspace;

public class Main {

    public static void main(String[] args) {
        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24

        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00

        Color[] colors = Color.values();
        for (Color s : colors) { System.out.println(s); } // RED BLUE GREEN
        System.out.println(Color.BLUE.ordinal()); // 1 - номер по порядку в перечислении
        Color color = Color.BLUE;
        System.out.println(color.name());// BLUE - метод .name() возвращает название текущей enum константы
        // нужен на тот случай, когда .toString() переопределен
        Color color1 = Color.valueOf("RED");// используется, когда из строки нужно получить enum
        System.out.println(color1.name());
    }
}
