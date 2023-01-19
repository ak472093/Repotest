/**
 *
 * @author khalil
 */
//comment
public class Student {
    String name;
    int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    @Override
        public String toString() {
            return "Student [ID=" + ID + ", name=" + name + "]";
        }
   
}
