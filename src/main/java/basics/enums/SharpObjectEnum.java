package basics.enums;

public enum SharpObjectEnum {
    KNIFE("knife"),
    SCISSOR("scissor"),
    PEELER("peeler");

    private String type;

    private SharpObjectEnum(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

}
