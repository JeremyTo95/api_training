package fr.esiea.ex4A.api;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoveService {
    private List<UserInfo> userList;

    public LoveService() {
        this.userList = new ArrayList<>();
        this.userList.add(new UserInfo("fille0@gmail.com", "fille0", "Fille00", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille1@gmail.com", "fille1", "Fille01", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille2@gmail.com", "fille2", "Fille02", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille3@gmail.com", "fille3", "Fille03", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille4@gmail.com", "fille4", "Fille04", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille5@gmail.com", "fille5", "Fille05", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille6@gmail.com", "fille6", "Fille06", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille7@gmail.com", "fille7", "Fille07", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille8@gmail.com", "fille8", "Fille08", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille9@gmail.com", "fille9", "Fille09", "Fr", "F", "M"));
        this.userList.add(new UserInfo("gars0@gmail.com", "gars0", "Gars00", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars1@gmail.com", "gars1", "Gars01", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars2@gmail.com", "gars2", "Gars02", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars3@gmail.com", "gars3", "Gars03", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars4@gmail.com", "gars4", "Gars04", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars5@gmail.com", "gars5", "Gars05", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars6@gmail.com", "gars6", "Gars06", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars7@gmail.com", "gars7", "Gars07", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars8@gmail.com", "gars8", "Gars08", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars8@gmail.com", "gars8", "Gars08", "Fr", "M", "F"));
    }

    void signinUser(UserInfo userInfo) {
        userList.add(userInfo);
    }

    List<UserInfo> getUserList() {
        return userList;
    }
}
