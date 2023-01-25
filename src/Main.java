public class Main {

    public static void main(String[] args) {
        MagicBox <Integer> magicBox = new MagicBox<Integer>(3);

        magicBox.add(21);
        magicBox.add(33);
        magicBox.add(65);
        magicBox.pick();
    }
}