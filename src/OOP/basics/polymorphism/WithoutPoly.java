package OOP.basics.polymorphism;

public class WithoutPoly {

    void loginwithPassword(){
        System.out.println("Login using username and password");
    }

    void loginwithOTP(){
        System.out.println("Login using OTP");
    }

    void loginwithFaceID(){
        System.out.println("Login using FaceID");
    }

    static void main(String[] args) {
        WithoutPoly login = new WithoutPoly();
        login.loginwithFaceID();
        login.loginwithOTP();
        login.loginwithPassword();
    }
}
