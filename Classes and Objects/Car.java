public class Car {
        String make;
        int model;

        Car(String make,int model) {
            this.make = make;
            this.model = model;
        }

        void carDetails() {
            System.out.println("The make of the car is " + make);
            System.out.println("The model of the car is " + model);
        }
}

