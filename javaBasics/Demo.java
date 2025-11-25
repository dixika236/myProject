class Car { 
void showTransmission() { 
System.out.println("Transmission Manual"); 
} 
} 
class ElectricCar extends Car { 
void showTransmission() { 
System.out.println("Transmission AMT"); 
} 
void showInfo() { 
this.showTransmission(); 
super.showTransmission(); 
} 
} 
public class MethodOverriding2 { 
public static void main(String[] args) { 
ElectricCar ec = new ElectricCar(); 
ec.showInfo(); 
} 
}