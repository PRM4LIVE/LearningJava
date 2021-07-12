import javax.sound.midi.Receiver;

public class SixthChapter {
    public static void main(String[] args) {
        Cat simon = new Cat();
        Animal creature = simon;
        simon.eat();
        simon.purr();
        simon.breathe();
    }
}
class Animal {
    float weight;
    void eat(){
        System.out.println("Киса ест");
    }
}
class Manual extends Animal{
    int heartRate;
    void breathe(){
        System.out.println("Киса дышит");
    }
}
class Cat extends Manual{
    //Наследует weight и heartRate
    boolean longHair;
    //наследует eat() и breathe()
    void purr(){
        System.out.println("Киса урчит");
    }
    interface TextReceiver{
        void receiverText (String text);
    }
    class TickerTape implements TextReceiver {
        public void receiverText (String text){
            System.out.println("TICKER:\n" + text + "\n");
        }
    }
    class TextSource{
        TextReceiver receiver;
        TextSource(TextReceiver r){
            receiver = r;
        }
    }
    public void sendText(String s){
        //receiver.receiveText(s);
    }
}