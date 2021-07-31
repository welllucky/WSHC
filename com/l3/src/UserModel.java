abstract class UserModel {
    
    UserModel(String name, int sex,String birthdate){
        totalIds += 1;
        this.id = totalIds;
        this.name = name;
        this.birthdate = birthdate;
        //this.age = 
        this.sex = (sex == 0) ?  "mulher" : "homem"; // 0 para mulher // 1 para homem
    }
    
    private static int totalIds;
    private String name;
    private int id;
    private byte age; 
    private String birthdate;
    private String sex;
    private String username;
    private String password;
    //private int[] doTasksNum = new int[4]; //espaço 0: tarefas no dia // espaço 1: tarefas no mês // espaço 2: tarefas no ano // espaço 3: tarefas no total
    //private String mostDoTask;
    //private String lessDoTask;
    //private ** devicesList;
    //private ** taskList;
    
    public String getName() {return name;}

    public static double getTotalIds() {return totalIds;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getSex() {return sex;}

    public void setSex(String sex) {this.sex = sex;}

    public String getBirthdate() {return birthdate;}

    public void setBirthdate(String birthdate) {this.birthdate = birthdate;}

    public byte getAge() {return age;}

    public void setAge(byte age) { this.age = age;}

    public double getId() { return id;}

    public void setName(String name) { this.name = name;}

    abstract public String getUserType();
}
