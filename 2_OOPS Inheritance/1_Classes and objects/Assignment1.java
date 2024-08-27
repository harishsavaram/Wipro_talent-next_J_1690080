package mypack;
class Box {
    int width;
    int height;
    int depth;
    Box()
    {
    	
    }
    void length(int a)
    {
        this.width=a;
    }
    void bredth(int b)
    {
        this.height=b;
    }
    void height(int c)
    {
        this.depth=c;
    }
    void BoxVolume(int a,int b,int c)
    {
        int volume=a*b*c;
        System.out.println("Volume of Box is: "+volume);
    }
}
public class BoxDemo{
    public static void main(String[] args) {
        Box b=new Box();
        b.BoxVolume(100,200,600);
    }
}
