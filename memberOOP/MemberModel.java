package memberOOP;

public class MemberModel {
    private String identification;
    private String password;
    private String verifyPassword;
    private String name;
    private String socialSecurityNumber;
    private String phoneNumber;
    private String address;

    public MemberModel(){   this("", "", "", "", "", "","");  };

    public MemberModel(String id, String pw, String verifyPassword, String name,
                       String socialSecurityNumber, String phoneNumber, String address){
        this.identification = id;
        this.password = pw;
        this.verifyPassword = verifyPassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPassword() {
        return password;
    }
    public String getVerifyPassword() { return verifyPassword;  }

    public String getName() {   return name;    }

    public String getPhoneNumber() {    return phoneNumber; }

    public String getSocialSecurityNumber() {   return socialSecurityNumber;    }

    public String getAddress() {    return address; }

    @Override
    public String toString() {
        return "MemberModel{" +
                "identification='" + identification + '\'' +
                ", password='" + password + '\'' +
                ", verifyPassword='" + verifyPassword + '\'' +
                ", name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}