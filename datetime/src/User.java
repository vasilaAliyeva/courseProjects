import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private LocalDateTime time;
    public static ArrayList<User> list = new ArrayList<>();
    public User() {

    }

    public User(String name, String surname, LocalDateTime time) {
        this.name = name;
        this.surname = surname;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", time=" + time +
                '}' + "\n";
    }
    //modifydate - user update eliyende axirinci update vaxtinii elave edek

    //create olanda scanner ile dogum tarixini elave yas 10 dan asagidisa icaze veremsin

    public void createUser() {
        //user create edilmesi
        //scanner getrildi cagirildi db add olundu
        Scanner sc = new Scanner(System.in);
        System.out.println("name daxil edin: ");

        String username = sc.nextLine();
        System.out.println("surname daxil edin: ");

        LocalDateTime localDateTime = LocalDateTime.now();

        String surname = sc.nextLine();
        User user1 = new User(username, surname, localDateTime);
        list.add(user1);
        System.out.println(list);
    }
public void modifyUser(){

}

}
