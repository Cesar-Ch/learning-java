package Day06class;

class Second {

    int modelYear;
    String modelName;

    Second(int year, String name) {
        this.modelYear = year;
        this.modelName = name;
    }

    void myDescriptionCar() {
        System.out.println("My car is a " + this.modelYear + " " + this.modelName);
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
        // myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        myObj.myPublicMethod(); // Call the public method on the object

        Second myCar = new Second(1969, "Mustang");
        myCar.myDescriptionCar();
    }
}