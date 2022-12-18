package structural_patterns.adapter_patterns.legacy;

public class LegacyBankAccount {
    private Integer ID;
    private String name;

    public LegacyBankAccount(Integer iD, String name) {
        ID = iD;
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
