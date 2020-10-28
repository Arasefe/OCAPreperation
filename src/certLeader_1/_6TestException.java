package certLeader_1;

import java.io.IOException;

public class _6TestException {
    public static void main(String[] args) throws IOException {
        X obj=new X();
        obj.printFileContent();
    }
}
class X{
    public void printFileContent() throws IOException{
        throw new IOException();
    }
}