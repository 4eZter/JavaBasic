package sourseit.homeworks.homework5.first;


class test{

    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 1989);
        Car car2 = new Car("Jeep", 1970);
        Car car3 = new Car("Jeep", 1970);

        System.out.println("equals sample " + car2.equals(car3));
        System.out.println("equals sample " + car1.equals(car2));

        System.out.println("compareTO sample when car1.year > car2.year - " + car1.compareTo(car2));

        System.out.println("car1 hashCode " + car1.hashCode());
        System.out.println("car2 hashCode " + car2.hashCode());
        System.out.println("car3 hashCode " + car3.hashCode());
    }



}
class Car implements Comparable{
    private String name;
    private int age;

    public Car(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.age;
        return hash;
    }

    @Override
    public int compareTo(Object obj) {
        Car tmp = (Car)obj;
        //меньшее
        if(this.age < tmp.age)
        {
            return -1;
        }
        //большее
        else if(this.age > tmp.age)
        {
            return 1;
        //равно
        }else if(this.age == tmp.age)

        return 0;   return 0;
    }
}
