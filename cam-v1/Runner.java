
import javax.swing.*;

public class Runner {

public Runner(){
      VirtualPet p = new VirtualPet();
      takeABeat(1000);
      p.exercise();
      p.feed();
      p.cry();
      p.play();

      }

public int getCategoryResponse(String q) {
    Object[] options = {"Yes, please",
                "No way!"};
    int n = JOptionPane.showOptionDialog(
        new JFrame(),
        "test"
        "test2"
    )
}




    public void takeABeat(int milliseconds) {
        try{
            Thread.sleep(milliseconds);

        } catch (Exception e) {}
    }

public String getResponse(String s) {
    String a = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "How was your day?",
                    "test",
                    JOptionPane.PLAIN_MESSAGE

        );
        if (s.equals("good")) {
            return "thats good";
        }
}
    

    public static void main(String[] args) {
        
      
}

}
