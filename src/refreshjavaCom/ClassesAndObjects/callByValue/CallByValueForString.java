package refreshjavaCom.ClassesAndObjects.callByValue;

class CallByValueForString {
    public static void main(String [] args) {
        String str = "String";
        StringBuffer strbuf = new StringBuffer("StringBuffer");
        System.out.println("Before method call, str = "+str+ ", strbuf = "+strbuf);//Before method call, str = String, strbuf = StringBuffer
        changeValue(str,strbuf);//In changeValue method, temp = String Modified, tempbuf = StringBuffer Modified
        System.out.println("After method call, str = "+str+ ", strbuf = "+strbuf);//After method call, str = String, strbuf = StringBuffer Modified
    }
    public static void changeValue(String temp, StringBuffer tempbuf) {
        temp = "String Modified";
        tempbuf = tempbuf.append(" Modified");
        System.out.println("In changeValue method, temp = "+temp+ ", tempbuf = "+tempbuf);
    }
}
