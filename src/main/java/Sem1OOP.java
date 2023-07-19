public class Sem1OOP {
    static class Car {
        public String Name;
        public int Speed;

        Car (String name, int speed){ // перегрузка
            this.Name = name;
            this.Speed = speed;
        }
        Car (int speed){
            this("Test", speed);
        }
        Car(){
            this(0);
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 12);
        Car car2 = new Car(120);
        Car car3 = new Car();
        System.out.println(car1.Name + " " + car1.Speed);
        System.out.println(car2.Name + " " + car2.Speed);
        System.out.println(car3.Name + " " + car3.Speed);
    }
}
