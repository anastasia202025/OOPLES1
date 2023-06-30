package LESSON1;

public class Animal {
    private String name;
private String owner;
private String species;
       private Integer age;
       private String color;
       private String vaccinate;
private Integer legsCount;
public Animal(String name, String owner, String species, Integer age, String color, String vaccinate,
                     Integer legsCount) {
              this.name = name;
              this.owner = owner;
              this.species = species;
              this.age = age;
              this.color = color;
              this.vaccinate = vaccinate;
              this.legsCount = legsCount;
       }
public Animal(String name, String owner, String species, Integer age, String color, String vaccinate,
                     Integer legsCount) {
              this.name = name;
              this.owner = owner;
              this.species = species;
              this.age = age;
              this.color = color;
              this.vaccinate = vaccinate;
              this.legsCount = legsCount;
       }
    public Animal(String name, String owner, String species, Integer age, String color, String vaccinate,
                     Integer legsCount) {
              this.name = name;
              this.owner = owner;
              this.species = species;
              this.age = age;
              this.color = color;
              this.vaccinate = vaccinate;
              this.legsCount = legsCount;
       }
    public Animal(String name, String owner, String species, Integer age, String color, String vaccinate,
                     Integer legsCount) {
              this.name = name;
              this.owner = owner;
              this.species = species;
              this.age = age;
              this.color = color;
              this.vaccinate = vaccinate;
              this.legsCount = legsCount;
       }
    public Animal(String name, String owner, String species, Integer age, String color, String vaccinate, Integer legsCount) {
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.age = age;
        this.color = color;
        this.vaccinate = vaccinate;
        this.legsCount = legsCount;
    }
    public Animal(String species, String color, Integer legsCount){
        this(null, null, species, null, color, null, legsCount);
    }
    @Override
public boolean equals(Object obj) {
       // TODO Auto-generated method stub
       return super.equals(obj);
}
    @Override
public int hashCode() {
       // TODO Auto-generated method stub
       return super.hashCode();
}

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("Name = %s, Owner = %s, Species = %, Age = %d, Color = %s, Vaccinate = %s , LegsCount = %d",
        name, owner,species,age,color,vaccinate,legsCount);
    }
    public void ToGo() {
        System.out.println(this.name + " going");
    }
    public void Fly() {
        System.out.println(this.name + " flying");
    }
    public void Swim() {
        System.out.println(this.name + " swimming");
    }
    public String getName() {
       return name;
}
    public void setName(String name) {
       this.name = name;
}
public String getOwner() {
       return owner;
}
public void setOwner(String owner) {
       this.owner = owner;
}
public String getSpecies() {
       return species;
}
public void setSpecies(String species) {
       this.species = species;
}
public String getColor() {
       return color;
}
public void setColor(String color) {
       this.color = color;
}
public String getVaccinate() {
       return vaccinate;
}
public void setVaccinate(String vaccinate) {
       this.vaccinate = vaccinate;
}
public Integer getLegsCount() {
       return legsCount;
}
public void setLegsCount(Integer legsCount) {
       this.legsCount = legsCount;
}
@Override
       protected Object clone() throws CloneNotSupportedException {
              // TODO Auto-generated method stub
              return super.clone();
       }
@Override
protected void finalize() throws Throwable {
       // TODO Auto-generated method stub
       super.finalize();
}
}