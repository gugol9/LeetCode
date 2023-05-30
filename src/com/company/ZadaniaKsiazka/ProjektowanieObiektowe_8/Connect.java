package com.company.ZadaniaKsiazka.ProjektowanieObiektowe_8;

public class Connect {

    private String connectName;

    

    private static Connect INSTANCE = new Connect();

    private Connect() {
    }

    public static Connect getInstance() {
        if(INSTANCE == null){
            INSTANCE = new Connect();
        }
        return INSTANCE;
    }

    public void setConnectName(String connectName) {
        this.connectName = connectName;
    }

    @Override
    public String toString() {
        return "Connect{" +
                "connectName='" + connectName + '\'' +
                '}';
    }
}
