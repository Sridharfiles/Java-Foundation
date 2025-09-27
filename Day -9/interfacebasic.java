interface one {
    static final int a = 10;
    void show();
}
interface printable {
    void printing();
}
interface showable {
    void showing();
}
class documents implements printable,showable {
    @Override
    public void printing() {
        System.out.println("Printing ducuments.");
    }
    @Override
    public void showing() {
        System.out.println("showing ducuments.");
    }
}
class b implements one {
    public void show(){
        System.out.println("Value of final data : "+a);
    }
}
public class interfacebasic {
    public static void main(String[] args) {
        one obj = new b();
        obj.show();
        documents doc = new documents();
        doc.printing();
        doc.showing();
    }
}

