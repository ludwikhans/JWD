package pl.edu.wszib.enums;

public enum CardinalPoint {
    N("Północ","North",0),
    E("Wschód","East",90),
    S("Południe","South",180),
    W("Zachód","West",270),
    NE("Północny wschód","Northeast",45),
    SE("Południowy wschód", "Southeast",135),
    SW("Południowy zachód","Southwest",225),
    NW("Północnyzachód","Northwest",315);


    private String namePL;
    private String nameEnglish;
    private int rotation;

    CardinalPoint(String namePL, String nameEnglish, int rotation) {
        this.namePL = namePL;
        this.nameEnglish = nameEnglish;
        this.rotation = rotation;
    }

    public String getNamePL() {
        return namePL;
    }

    public void setNamePL(String namePL) {
        this.namePL = namePL;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "CardinalPoint{" +
                "namePL='" + namePL + '\'' +
                ", nameEnglish='" + nameEnglish + '\'' +
                ", rotation=" + rotation +
                '}';
    }
}



