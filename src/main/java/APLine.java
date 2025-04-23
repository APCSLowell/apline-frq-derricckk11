public class APLine
{
  /* your code here */
  private int aVal;
  private int bVal;
  private int cVal;
  
  
  public APLine(int a, int b, int c){

    aVal = a; 
    bVal = b;
    cVal = c; 
  }


  public double getSlope(){

      return (double) -aVal/bVal; 
    
  }

  public boolean isOnLine(int x, int y){


    if(aVal * x + bVal * y + cVal == 0){

      return true;
      
    }

    return false; 
  }
}
