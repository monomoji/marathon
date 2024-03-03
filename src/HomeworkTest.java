public class HomeworkTest {
    public static void main(String[] args) {


        int[] timePeriods = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak" };

        Homework1 myMaraton = new Homework1(timePeriods);

        System.out.println("Birinci: " + names[myMaraton.first()] + " " + timePeriods[myMaraton.first()] + "'");
        System.out.println("İkinci: " + names[myMaraton.second()] + " " + timePeriods[myMaraton.second()] + "'");
        System.out.println("Üçüncü: " + names[myMaraton.third()] + " " + timePeriods[myMaraton.third()] + "'");

        myMaraton.letter();

    }
}
