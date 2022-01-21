package refreshjavaCom.ProgramExample;

class CalculateArea
{
    public static void main(String [] args)
    {
        float radius = 10.5f;
        float pi = 22/7f;
        int length = 10;
        int width = 20;
        float circleArea = pi*radius*radius;
        int rectArea = length*width;
        System.out.println("area of circle = "+circleArea);
        System.out.println("area of rectangle = "+rectArea);
    }
}