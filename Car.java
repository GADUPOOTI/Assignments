interface Car {
public void milege();
}
class Audi implements Car {
public void milege() {
System.out.println("Audi milege is 10KMs");
}
}
class Maruthi implements Car {
public void milege() {
System.out.println("Maruthi milege is 15KMs");
}
}
class Toyoto implements Car {
public void milege(){
System.out.println("Toyoto milege is 20KMs");
}
}
class Test {
public static void main(String args[])
{
Car c = new Audi();
c.milege(); 
Car car = new Maruthi();
car.milege(); 
Car cars = new Toyoto();
cars.milege(); 
}
}

