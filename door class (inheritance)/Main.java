  public class Main {
    public static void main(String[] args)
    {
        HouseFrontDoor d1= new HouseFrontDoor();
        d1.Open();
    }

  }
class BankVaultDoor extends Door {

  public void Open() {
    
    int code = 1222;
    if (code == super.enterCombination()) {
      System.out.println("THE VAULT" + super.open());
    } else {
      System.out.println("INCORRECT CODE");
    }

  }

}

class HouseFrontDoor extends Door {
  // Your code goes here
  public void Open() {
    //super.enterCombination();
    int code = 4743;
    if (code == enterCombination()) {
      System.out.println("THE FRONT" + super.open());
    } else {
      System.out.println("INCORRECT CODE");
    }
    
  }

}



