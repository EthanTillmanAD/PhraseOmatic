package phrase;

public class PhraseOMatic {

    public static void main(String[] args) {

        String[] wordListOne = {"box", "control", "mic"};
        String[] wordListTwo = {"moucse", "keyboard", "gum", "speakers", "switchbox"};
        String[] wordListThree = {"towl", "laptop", "tools", "soda", "car", "motorcycle", "bed",
                "xbox", "playstation", "donut"};

        int listOne = wordListOne.length;
        int listTwo = wordListTwo.length;
        int listThree = wordListThree.length;
        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println(listThree);

        int rand1 = (int) (Math.random() * listOne);
        int rand2 = (int) (Math.random() * listTwo);
        int rand3 = (int) (Math.random() * listThree);

        String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + ", and " + wordListThree[rand3];

        System.out.println("3 things I have own" + ", and " + phrase);
    }

 }



