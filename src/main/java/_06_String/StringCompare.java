package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // equals 괄호뒤에 비교대상넣기
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python")); //  대소문자 구별하지 않고 내용적으로만 판별

        String password1 = "1234";
        String password2 = "1234";
        // 1234가 저장되어있는 메모리공간을 password1, password2가 같은 공간을 참조하고 있다.

        System.out.println(password1 == password2); // 참조 위치 비교
        System.out.println(password1.equals(password2)); // 내용 비교
        password1 = new String("1234");
        password2 = new String("1234");
        // 내용이 같더라도 새로운 메모리 공간을 각각 할당하여 다른 위치에 저장한다
        // 각각 참조하고 있음

        System.out.println(password1 == password2); //참조 위치가 다르다
        System.out.println(password1.equals(password2)); // 하지만 내용은 같다
    }
}
