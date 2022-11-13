public class Main {
    public static void main(String[] args) {

        MagicBox<String> stringMagicBox = new MagicBox<>(3);

        boolean numborOne = stringMagicBox.add("1");
        boolean numborTwo = stringMagicBox.add("2");
        boolean numborThree = stringMagicBox.add("3");
        String pick = stringMagicBox.pick();
        System.out.println(numborOne);
        System.out.println(numborTwo);
        System.out.println(numborThree);
        System.out.println(pick);

    }
}

