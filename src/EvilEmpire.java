import java.net.Socket;

public class EvilEmpire {
    public static void main(String[] args) throws Exception{
        try{
            Socket s = new Socket("87.250.250.242", 80);
            System.out.println("Подключено!");
        }
        catch (SecurityException e){
            System.out.println("SecurityException: не удалось подключиться.");
        }
    }
}
