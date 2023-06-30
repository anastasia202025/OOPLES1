public class Duck extends Animal {

       public Duck(String name, String owner, String species, Integer age, String color, String vaccinate,
       Integer legsCount) 
       {
              super(name, owner, species, age, color, vaccinate, legsCount);
              //TODO Auto-generated constructor stub
       }

       @Override
       public String toString() {
              return "Duck []";
       }

       @Override
       public void Fly() {
              // TODO Auto-generated method stub
              super.Fly();
       }

       @Override
       public void Swim() {
              // TODO Auto-generated method stub
              super.Swim();
       }

       @Override
       public void ToGo() {
              // TODO Auto-generated method stub
              super.ToGo();
       }

       @Override
       protected Object clone() throws CloneNotSupportedException {
              // TODO Auto-generated method stub
              return super.clone();
       }

       @Override
       public boolean equals(Object obj) {
              // TODO Auto-generated method stub
              return super.equals(obj);
       }

       @Override
       protected void finalize() throws Throwable {
              // TODO Auto-generated method stub
              super.finalize();
       }

       @Override
       public Integer getAge() {
              // TODO Auto-generated method stub
              return super.getAge();
       }

       @Override
       public String getColor() {
              // TODO Auto-generated method stub
              return super.getColor();
       }

       @Override
       public Integer getLegsCount() {
              // TODO Auto-generated method stub
              return super.getLegsCount();
       }

       @Override
       public String getName() {
              // TODO Auto-generated method stub
              return super.getName();
       }

       @Override
       public String getOwner() {
              // TODO Auto-generated method stub
              return super.getOwner();
       }

       @Override
       public String getSpecies() {
              // TODO Auto-generated method stub
              return super.getSpecies();
       }

       @Override
       public String getVaccinate() {
              // TODO Auto-generated method stub
              return super.getVaccinate();
       }

       @Override
       public int hashCode() {
              // TODO Auto-generated method stub
              return super.hashCode();
       }

       @Override
       public void setAge(Integer age) {
              // TODO Auto-generated method stub
              super.setAge(age);
       }

       @Override
       public void setColor(String color) {
              // TODO Auto-generated method stub
              super.setColor(color);
       }

       @Override
       public void setLegsCount(Integer legsCount) {
              // TODO Auto-generated method stub
              super.setLegsCount(legsCount);
       }

       @Override
       public void setName(String name) {
              // TODO Auto-generated method stub
              super.setName(name);
       }

       @Override
       public void setOwner(String owner) {
              // TODO Auto-generated method stub
              super.setOwner(owner);
       }

       @Override
       public void setSpecies(String species) {
              // TODO Auto-generated method stub
              super.setSpecies(species);
       }

       @Override
       public void setVaccinate(String vaccinate) {
              // TODO Auto-generated method stub
              super.setVaccinate(vaccinate);
       }
       
}
