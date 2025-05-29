package _27_Bean;

public class Main {
    public static void main(String[] args) {
        // UserEntity
        // UserId(Int), Username(String), age(Int), email(String) -> private
        // 기본생성자 하나씩 만들기
        // getter / setter
        // toString 오버라이드해서 정보 모두 출력되도록하자

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("JINI");
        userEntity.setAge(28);
        userEntity.setEmail("jinibrighteveryday@gmail.com");

        System.out.println(userEntity);

//        UserEntityLombok userEntityLombok = new UserEntityLombok();
//        userEntityLombok.getUserId();
//        userEntityLombok.getUsername();
//        userEntityLombok.getAge();
//        userEntityLombok.getEmail();
    }
}
