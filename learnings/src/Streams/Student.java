package learnings.src.Streams;

public class Student {
    private String sname;
    private int sid;
    private String email;
    private int age;

    public Student(String sname,int sid,String email,int age){
        this.age=age;
        this.sname=sname;
        this.sid=sid;
        this.email=email;
    }
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
