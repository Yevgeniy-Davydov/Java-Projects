public class Rectangle {

    // fields
    private double width;
    private double hight;

    // constructor
    public Rectangle(double width, double higth){
        if (width > 0 && higth > 0){
            this.width = width;
            this.hight = higth;

        }else{
            System.out.println("Ungueltige Eingabe, der Werte sollen > 0.0 sein");
            System.out.println("Werte sind jeweils auf 1.0 gesetzt");
            this.width = 1.0;
            this.hight = 1.0;
        }
    }

    // setter and getter
    // getter
    public double getWidth(){
        return width;
    }
    public double getHight(){
        return hight;
    }
    //setter
    public void setWidth(double value){
        if(value > 0){

        this.width = value;
        }else{
            System.out.println("Ungueltige Eingabe, der Wert soll > 0.0 sein.");
            System.out.println("Wert unverändert");

        }
    }
    public void setHight(double value){
        if (value > 0){
            this.hight = value;
        }else{
            System.out.println("Ungueltige Eingabe, der Wert soll > 0.0 sein");
            System.out.println("Wert unverändert");


        }
    }
    // methods no need of parameter!!!
    public double calcArea(){
        return width * hight;
    }
    public double calcPerimeter(){
        return 2 * (width + hight);
    }
    public void scale(double factor){
        if(factor > 0){
            width = factor * width;
            hight = factor * hight;

        }else{
            System.out.println("Faktor soll groesser als 0 sein!");
            System.out.println("Wert unverändert");

        }
    }


//    @Override
//    public String toString() {
//        return "Rectangle{" + "\n"+
//                "width = "+ width + ";" + "\n" +
//                "hight = " + hight + ";" + "\n" +
//                "}";
//
//
//        }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", hight=" + hight +
                '}';
    }
}
