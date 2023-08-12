package Day06class;

class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
        //myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        myObj.myPublicMethod(); // Call the public method on the object
    }
}