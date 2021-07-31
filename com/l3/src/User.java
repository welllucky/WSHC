public class User extends UserModel {
    User(String name, int sex, String birthdate){
        super(name, sex, birthdate);
    }

    @Override
    public String getUserType() {
        return "user";
    }

}
