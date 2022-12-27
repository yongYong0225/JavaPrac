import java.util.Random;

public class example {
    public static void main(String[] args) {

        Random random = new Random();

        String hashtag = "#";
//		while (isPresentHashtag(hashtag) != null) {
        for (int i = 0; i < 4; i++) {
            hashtag += random.nextInt((9) + 1);
        }

        System.out.println(hashtag);
    }
}
