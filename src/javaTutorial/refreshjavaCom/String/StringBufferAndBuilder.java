package javaTutorial.refreshjavaCom.String;
class	StringBufferAndBuilder
{
    public static void main(String args[])
    {
        String str = "refresh java";
        String str2 = str;
        StringBuffer strbuff = new StringBuffer("StringBuffer on refresh java");
        StringBuffer strbuff2 = strbuff;
        StringBuilder strbuild = new StringBuilder("StringBuilder on refresh java");
        StringBuilder strbuild2 = strbuild;

        str = str + " tutorial";
        strbuff = strbuff.append(" tutorial");
        strbuild = strbuild.append(" tutorial");

        System.out.println("str = "+str);
        System.out.println("str2 = "+str2);
        System.out.println("strbuff = "+strbuff);
        System.out.println("strbuff2 = "+strbuff2);
        System.out.println("strbuild = "+strbuild);
        System.out.println("strbuild2 = "+strbuild2);


        String str1 = "String I love";
        System.out.println(str1);
        str1.concat(" mom");
        System.out.println(str1);
        System.out.println(str1.concat(" mom"));
        System.out.println(str1);


        StringBuffer strbuf1 = new StringBuffer( "StringBuffer I love");
        System.out.println(strbuf1);
        strbuf1.append(" mom");
        System.out.println(strbuf1);
        System.out.println(strbuf1.append(" mom"));
        strbuf1.insert(0,"java");
        System.out.println(strbuf1);
        strbuf1.reverse();
        System.out.println(strbuf1);
        strbuf1.setCharAt(1,'s');
        System.out.println(strbuf1);





    }
}