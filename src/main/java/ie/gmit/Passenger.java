package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String id;
    private String number;
    private int age;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title== "Mr" || title == "Mrs" || title=="Ms") {
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Title is not the right format");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=3) {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name is too short");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()>=10) {
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("ID is too short");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number.length()>=10) {
            this.number = number;
        }
        else{
            throw new IllegalArgumentException("Number is too short");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=16) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Age is too young");
        }
    }
    public Passenger(){
        setTitle("Mr");
        setName("Aaron");
        setId("1234567891011");
        setNumber("123456789123456");
        setAge(25);
    }
    public Passenger(String title, String name, String id, String number, int age){
        setName(name);
        setTitle(title);
        setId(id);
        setNumber(number);
        setAge(age);
    }
}
