/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */

 

public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;
    int happiness = 1;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("tired");
        face.setMessage("The baby is starting to get hungry...");
    }





    public boolean fed(String f){
        Integer i = Integer.parseInt(f);
        if (i <= 3) {
            return true;
        }
        return false;
    }
    
public void defender(String a) {
        if (a.equals("Upset")) {
            face.setMessage("Oh no! You're baby is upset!");
            face.setImage("cry");
        }

        if (a.equals("")) {
            face.setMessage("");
            face.setImage("");
        }

    }


public void takeABeat(int milliseconds) {
    try {
        Thread.sleep(milliseconds); // milliseconds
    } catch (Exception e) {
    }
}


    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void cry() {
        if (hunger == 0) {
            face.setImage("cry");
        }
    }

    public void play() {
        if (hunger > 3) {
            face.setImage("joyful");
        }
        
    }

} // end Virtual Pet
