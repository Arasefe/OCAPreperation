package certLeader;

public class _51ReportTool extends Tool implements Exportable {
    public void export(){
        System.out.println("RTool :: export");
    }

    public static void main(String[] args) {
        Tool aTool=new _51ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);
    }


    public static void callExport(Exportable ex){
        ex.export();
    }
}
class Tool implements Exportable{
    public void export(){
        System.out.println("Tool::export");
    }
}
interface Exportable{
    void export();
}