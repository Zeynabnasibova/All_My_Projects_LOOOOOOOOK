package SaimPdf.unit5ProblemSet.interfacePractice2;


class DemoClass implements FirstInterface, SecondInterface {

    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}