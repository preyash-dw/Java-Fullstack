interface Polygon {
    void area(int length,int breadth);
}

class Rectangle implements Polygon{
    public void area(int length,int breadth){
        System.out.println("The area is :"+(length*breadth));
    }
}
class inter{
    public static void main(String a[]){
        Rectangle ob=new Rectangle();
        ob.area(10,5);
    }
}