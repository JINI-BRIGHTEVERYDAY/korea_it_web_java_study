package _21_Class.BankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
        bankAccount.deposit(-40000);

        bankAccount.withdraw(3800);
        bankAccount.withdraw(20000);

        // return 출력처리
        //bankAccount.getBalance(); return 처리 되었으므로 무시됨
        System.out.println("현재 잔액은 " + bankAccount.getBalance() + "원 입니다.");
    }


    // 문제
    // 패키지로 WaterBottle 만들고, WaterBottle클래스, WaterBottleMain클래스 만들기
    // currentWater 현재 물의 양
    // 메소드
    // 물 채우기(fill) => 최대 용량인 1000을 넘을 수 없다.
    // 물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
    // getter를 통해서 현재 물병의 물의 양에 접근할 수 있다.

}
