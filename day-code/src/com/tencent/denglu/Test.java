package com.tencent.denglu;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "zhangyu";
        String p = "peko34";
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter the password and account");
            String password;
            String accountName;
            accountName = sc.next();
            password = sc.next();
            if (accountName.equals(a) && password.equals(p)){
                flag = true;
            }
            if (flag == true){
                System.out.println("登陆成功");
                break;
            }
            else {
                System.out.println("wrong password or account name");
            }
        }
    }
}
