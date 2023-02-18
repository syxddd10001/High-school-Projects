package lockCombination;

public class lockClass {
    
    int intNum1;
    int intNum2;
    int intNum3;
    boolean locked = true;
    public lockClass(int intNum1, int intNum2, int intNum3)
    {
    //assign characteristics from parameters
        
        this.intNum1 = (int)(Math.random()*10+1);
        this.intNum2 = (int)(Math.random()*10+1);
        this.intNum3 = (int)(Math.random()*10+1);
    }

    
    
    
    
    
 //set and get is unneccesary if you dont use it    
    public void setNum1(int factor)
    {
        this.intNum1 = factor;
    }

    public void setNum2(int factor)
    {
        this.intNum2 = factor;
    }

    public void setNum3(int factor)
    {
        this.intNum3 = factor;
    }
    
    
    
    public int getNum1()
    {
        return this.intNum1;
    }

    public int getNum2()
    {
        return this.intNum2;

    }

    public int getNum3()
    {
        return this.intNum3;

    }
   

   
    
    
    public void checkCombo(int inp1, int inp2, int inp3)
    {
    		System.out.println("You Typed " + inp1 + " "  + inp2 + " "  + inp3 );
    		System.out.println("The Combo " + intNum1 + " "  + intNum2 + " "  + intNum3 );
        	if (inp1 == (intNum1) && inp2 == intNum2 && inp3 == intNum3)
        	{
        		locked = false;
        		System.out.println("Unlocked!");
        		
        		
        	}
        	
        	
        	else
        	{
        		System.out.println("Locked!");
        		
        		
        	}
        	
        	
        	
        	
        	
        
    }
	
	
	
	
	
}
