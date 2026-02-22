class Volume{
    //volume of cube
    double volume(double side){
        return side*side*side;
    }
    
    //volume of cylinder
    double volume(double radius,double height){
        return 3.14 * radius * radius * height;
    }

    //volume of a renctanglar box
    double volume(double length,double breadth,double height){
        return length * breadth * height;
    }
}

public class Volumes{
    public static void main(String[] args){
       Volume v = new Volume();
       System.out.println("volume of cube: "+ v.volume(4));
       System.out.println("volume of cylinder: "+ v.volume(4,5));
       System.out.println("volume of rectangular box: "+ v.volume(4,5,6));   
    }
}