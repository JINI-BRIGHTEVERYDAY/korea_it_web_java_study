package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        // 다중 조건문
        int avgScore = 88;

        // 90이상이라면 "A"
        // 80이상이라면 "B"
        // 70이상이라면 "C"
        // 나머지는 "D"

        if (avgScore >= 90) {
            System.out.println("등급 : A");
        } else if (avgScore >= 80) {
            System.out.println("등급 : B");
        } else if (avgScore >= 70) {
            System.out.println("등급 : C");
        } else{ // 앞의 조건을 모두 만족하지 않을 때
            System.out.println("등급 : D");
        }
        // 앞에 참이 나온 조건이 있으면 뒤에는 다 무시
        ///
        //중첩 if문
        //
         int age = 27;
         String gender = "남성";
         if (age >= 20) {
             if (gender.equals("남성")) {
                 System.out.println("성인 남성입니다.");
             } else {
                 System.out.println("성인 여성입니다.");
             }
         } else {
             System.out.println("미성년자입니다.");
         }

    }

}
