package fr.esiea.ex4A.api;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LoveService {
    private UserInfo userConnected;
    private List<UserInfo> userList;

    public LoveService() {
        this.userList = new ArrayList<>();
        this.userList.add(new UserInfo("fille0@gmail.com", "fille0", "Fille00", "Fr", "F", "F"));
        this.userList.add(new UserInfo("fille1@gmail.com", "fille1", "Fille01", "Fr", "F", "F"));
        this.userList.add(new UserInfo("fille2@gmail.com", "fille2", "Fille02", "Fr", "F", "F"));
        this.userList.add(new UserInfo("fille3@gmail.com", "fille3", "Fille03", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille4@gmail.com", "fille4", "Fille04", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille5@gmail.com", "fille5", "Fille05", "Fr", "F", "M"));
        this.userList.add(new UserInfo("fille6@gmail.com", "fille6", "Fille06", "Fr", "F", "O"));
        this.userList.add(new UserInfo("fille7@gmail.com", "fille7", "Fille07", "Fr", "F", "O"));
        this.userList.add(new UserInfo("fille8@gmail.com", "fille8", "Fille08", "Fr", "F", "O"));
        this.userList.add(new UserInfo("fille9@gmail.com", "fille9", "Fille09", "Fr", "F", "M"));
        this.userList.add(new UserInfo("gars0@gmail.com", "gars0", "Gars00", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars1@gmail.com", "gars1", "Gars01", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars2@gmail.com", "gars2", "Gars02", "Fr", "M", "F"));
        this.userList.add(new UserInfo("gars3@gmail.com", "gars3", "Gars03", "Fr", "M", "M"));
        this.userList.add(new UserInfo("gars4@gmail.com", "gars4", "Gars04", "Fr", "M", "M"));
        this.userList.add(new UserInfo("gars5@gmail.com", "gars5", "Gars05", "Fr", "M", "M"));
        this.userList.add(new UserInfo("gars6@gmail.com", "gars6", "Gars06", "Fr", "M", "O"));
        this.userList.add(new UserInfo("gars7@gmail.com", "gars7", "Gars07", "Fr", "M", "O"));
        this.userList.add(new UserInfo("gars8@gmail.com", "gars8", "Gars08", "Fr", "M", "O"));
        this.userList.add(new UserInfo("other0@gmail.com", "other0", "other00", "Fr", "O", "0"));
        this.userList.add(new UserInfo("other1@gmail.com", "other1", "other01", "Fr", "O", "0"));
        this.userList.add(new UserInfo("other2@gmail.com", "other2", "other02", "Fr", "O", "0"));
        this.userList.add(new UserInfo("other3@gmail.com", "other3", "other03", "Fr", "O", "F"));
        this.userList.add(new UserInfo("other4@gmail.com", "other4", "other04", "Fr", "O", "F"));
        this.userList.add(new UserInfo("other5@gmail.com", "other5", "other05", "Fr", "O", "M"));
        this.userList.add(new UserInfo("other6@gmail.com", "other6", "other06", "Fr", "O", "M"));
        this.userList.add(new UserInfo("other7@gmail.com", "other7", "other07", "Fr", "O", "M"));
        this.userList.add(new UserInfo("other8@gmail.com", "other8", "other08", "Fr", "O", "O"));
        this.userList.add(new UserInfo("other8@gmail.com", "other8", "other08", "Fr", "O", "F"));
    }

    void signinUser(UserInfo userInfo) {
        this.userConnected = userInfo;
    }

    List<UserInfo> getUserList() {
        return userList;
    }

    List<UserInfo> getMatches() {
        List<UserInfo> matches = new ArrayList<>();
        for (UserInfo user: userList) {
            if (user.sex.equals(this.userConnected.sexPref) && user.sexPref.equals(this.userConnected.sex)) matches.add(user);
        }
        return matches;
    }
}
