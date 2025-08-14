package entity;

import java.time.LocalDateTime;

public class UserEntity {

    //QEYDIYYAT
    //min 2 maksimum 10 char uzunlugunda olmalidir
    //min 4 simvol max 8 simvol
    // eger her ikisi odemirse sertler odenmedi
    //her bir yaranmis istifadeci bir bazada ( arraylist, array) saxlansin

    //LOGIN
    //tuttaq ki 5 user yarandi login olanda scanner ile username ve password daxil etmelidi
    // uygun olaraq hemin arraylistde ona uygun getirilir ve giris ugurlu oldu yazsin
    // eger yoxdusa uygun mesaj gosterilir "3 defe sehv password daxil etmek sansi var ve eger 3den artiq oldusa
    //down olsun

    private String username;
    private String password;
    private LocalDateTime loginDate;

    public UserEntity(String username, String password, LocalDateTime loginDate) {
        this.username = username;
        this.password = password;
        this.loginDate = loginDate;
    }

    public UserEntity(String username, String password) {
        if (username.length() >= 2 && username.length() <= 10 && password.length() >= 4 && password.length() <= 8) {
            this.username = username;
            this.password = password;

       } else System.out.println("Username min 2 maksimum 10 char uzunlugunda olmalidir" +
                "\"Password min 4 simvol max 8 simvol olmalidir\"");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }// add sert

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{ " +
                "username= ' " + username + '\'' +
                ", password= ' " + password + '\'' +
                '}' + '\n';
    }
}
