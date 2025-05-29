package _14_Array;

public class ArrayPractice02 {

    public static void main(String[] args) {
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }

//        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i]);
//        }

        for (String country : countries) {
            System.out.println(country);
        }
    }
}
