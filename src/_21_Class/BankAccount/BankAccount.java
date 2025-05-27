package _21_Class.BankAccount;

public class BankAccount {
    private int balance;

    // 생성자 생성
    BankAccount() {

        System.out.println("계좌가 개설되었습니다. 현재 잔액: " + balance + "원");
    }

    // 메소드(입금, 출금)

    // 입금받기
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("계좌에 " + amount + "원이 입금되었습니다. 현재 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("0원 이상만 입금 가능합니다."); // 양의 수로 된 돈이 아니므로 더할 수 없음을 알림
        }
    }

    // 출금하기
    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("계좌에 " + amount + "원이 출금되었습니다. 현재 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("잔액 부족으로 출금할 수 없습니다. 현재 잔액은 " + balance + "원 입니다.");
        }
    }

    // 계좌 잔액 조회 - getter
    // 그럼, 입금과 출금을 담당하는 메소드들은 setter와 같다고 할 수 있는가?

    // 속성값을 변경한다는 관점으로 본다면, 그렇다고 할 수 있다.
    // 다만, setter와 이러한 메소드들의 차이를 이해해야 한다
    // 첫째로, setter는 값을 직접적으로 변경하고 있다. 입금 출금 메소드는 메소드명에서 드러나듯이
    // 행위에 중점을 두는 것 => 값을 직접적으로 변경하고 있는 것이 아니라 값을 계산해서 변경하고 있는 것이다.
    // 두 번째로는 setter는 검증 단계를 보통은 포함하지 않는다.
    // 하지만 메소드는 보통은 검증 단계를 포함할 수 있다. (반드시 검증이 필요한 것은 아니다)


    public int getBalance() {
        return balance;
    }
}
