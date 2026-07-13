package basics.polymorphism.compiletime;

public class WithPoly {

    void login(String username, String password){
        System.out.println("Login using username and password");
    }

    void login(String username, int pin){
        System.out.println("Login using username and pin");
    }

    void login(int pin, String username){
        System.out.println("Login using username and pin");
    }

    void login(int number){
        System.out.println("Login using OTP");
    }

    void login(){
        System.out.println("Login using FaceID");
    }

    void login(String appcode){
        System.out.println("Login using authenticator app");
    }


    static void main(String[] args) {
        WithPoly objlogin = new WithPoly();
        objlogin.login("jana",123);
    }
}
