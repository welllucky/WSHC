abstract class Adm extends UserModel{
    
    Adm(String name, int sex, String birthdate) {
        super(name, sex, birthdate);
    }
    @Override
    public String getUserType() {
        return "adm";
    }

}
