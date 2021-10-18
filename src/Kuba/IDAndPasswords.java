package Kuba;

import java.util.HashMap;

public class IDAndPasswords {

    HashMap<String, String>logininfo = new HashMap<>();

    IDAndPasswords(){
        logininfo.put("Kuba", "123");
        logininfo.put("Ala", "111");
        logininfo.put("Ola", "222");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
