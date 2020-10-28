package ocaCybertek.set4;

public class Question25 {
    void readCard(int cardNo) throws Exception {
        System.out.println("Reading card");
    }

    void checkCard(int cardNo) throws RuntimeException {
        System.out.println("Checking card");
    }

    public static void main(String[] args) {
        Question25 ex = new Question25();
        int cardio = 12344;
        ex.checkCard(cardio);
        try {
            ex.readCard(cardio);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
