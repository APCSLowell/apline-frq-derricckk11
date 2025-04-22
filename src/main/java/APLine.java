public class APLine
{
  /* your code here */
  public ApLine(int a; int b; int c){

    private int aVal = a; 
    private int bVal = b;
    private int cVal = c; 
  }


  public double getSlope(){

      return (double) -aVal/bVal; 
    
  }

  public boolean isOnLine(int x; int y){


    if(aVal * x + bVal * y + c == 0){

      return true;
      
    }

    return false; 
  }
}
