public class Student {
    int id;
    String name;
    int math;
    int Chinese;
    int English;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getChinese() {
        return Chinese;
    }
    public void setChinese(int chinese) {
        Chinese = chinese;
    }
    public int getEnglish() {
        return English;
    }
    public void setEnglish(int english) {
        English = english;
    }
    @Override
    public String toString() {
        return "Student [Chinese=" + Chinese + ", English=" + English + ", id=" + id + ", math=" + math + ", name="
                + name + "]";
    }

    
}
