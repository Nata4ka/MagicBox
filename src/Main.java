public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1=new MagicBox<>(3);
        box1.add("Удача на твоей стороне!!!");
        box1.add("Тебя ждет успех!!!");
        box1.add("Запомни: дорогу осилит идущий!");
        String x = box1.pick();
        System.out.println(x);

        MagicBox<Integer> box2 = new MagicBox<>(5);
        box2.add(15);
        box2.add(29);
        box2.add(8);
        box2.add(21);
        box2.add(5);
        int y = box2.pick();
        System.out.println(y);
    }
}