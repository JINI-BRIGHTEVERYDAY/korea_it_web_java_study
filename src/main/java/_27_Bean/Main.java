package _27_Bean;

public class Main {
    public static void main(String[] args) {

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
//
//        System.out.println(userEntityLombok);
    }
}
