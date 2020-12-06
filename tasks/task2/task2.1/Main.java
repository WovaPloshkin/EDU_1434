public class Main {
    public static void main(String[] args) {
        //напишите тут ваш код
String words[] = {"Мама","Мыла","Раму"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) continue;
                print(words[j]);
            }
            print(words[i]+"\n");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >=0 ; j--) {
                if (j==i) continue;
                print(words[j]);
        }

            print(words[i]+"\n");
            }

        }


    public static void print(String word) {
        System.out.print(word+",");

    }
}
