package rpl;

public class Authentication {
    private String UserAuth, PasswordAuth;

    public Authentication(String UserAuth, String PasswordAuth) {
        this.UserAuth = UserAuth;
        this.PasswordAuth = PasswordAuth;
    }

    public String getUserAuth() {
        return UserAuth;
    }

    public void setUserAuth(String UserAuth) {
        this.UserAuth = UserAuth;
    }

    public String getPasswordAuth() {
        return PasswordAuth;
    }

    public void setPasswordAuth(String PasswordAuth) {
        this.PasswordAuth = PasswordAuth;
    }
        
    public void Login(){
        System.out.println("Login Sukses");
    }
    
    public void Register(){
        System.out.println("Register Sukses");
    }
    
    public String GetUser(){
        return this.UserAuth;
    }
    
    public String GetPassword(){
        return this.PasswordAuth;
    }
}
