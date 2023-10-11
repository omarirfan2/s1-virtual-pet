public class Runner {
 
public Runner(){
      VirtualPet p = new VirtualPet();
      p.exercise();
      takeABeat(5000);
      p.feed();
      String ans = getAnswer("How are you?");
      System.out.println(ans);
      if (ans.equals("Good")){
        
      }
}

public void takeABeat(int millieseconds) {
try {
        Thread.sleep(1000); //milliseconds
    } catch(Exception e){
    
    }
}

    public static void main(String[] args) {
      new Runner();
}

}
