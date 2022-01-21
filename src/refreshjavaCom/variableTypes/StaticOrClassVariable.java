package refreshjavaCom.variableTypes;
class StaticOrClassVariable {
    static String classVar = "Class variable Test"; // class variable classVar
    static String collegeName;
    public static void main(String [ ] args) {
        System.out.println(collegeName);
        collegeName = "Seminole";
        System.out.println(collegeName);
        collegeName = "changeSeminole";
        System.out.println(collegeName);
        System.out.println(StaticOrClassVariable.collegeName);
        System.out.println(StaticOrClassVariable.classVar);
        //or
        StaticOrClassVariable obj = new StaticOrClassVariable();
        System.out.println(obj.classVar);
        System.out.println(classVar);
        System.out.println(collegeName);
        System.out.println(obj.collegeName);

    }
}