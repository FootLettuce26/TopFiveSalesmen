import java.util.Random;
public class Driver
{
    public static void main(String[] args)
    {
        Salesman[] totalSales; //you can also make instances and directly drop the into the array
        Random r = new Random();
        
        //for loop to create salesman based on how many times you want the loop to run
        int count = 0;
        totalSales = new Salesman[100];
        for(int i = 0; i < totalSales.length; i++)
        {
            totalSales[i] = new Salesman(count, r.nextInt(200000));
            System.out.println(i);
            System.out.println(totalSales[i].sales);
            count++;
        }
         //fill the array
        topFiveSalesman(totalSales); //calling the function
        
    }
    
    /*algorithm plan: sort the entire list first from smallest to largest
    and then drop the first elements until the new array is size 5 */
    
    public static Salesman[] topFiveSalesman(Salesman[] list)
    {
        Salesman[] topFive = new Salesman[5]; //creating final array
        
        int inOrderCount = 0;
        Salesman temp;
        
        while(inOrderCount < list.length-1) //is length < length?; sorting the entire list first
        {
            inOrderCount = 0;
            for(int i = 0; i < list.length-1; i++)
            {
                if(list[i].sales > list[i+1].sales) //checking to see if the first is greater than second
                {
                    inOrderCount++;
                }
                else if(list[i].sales < list[i+1].sales) //switches the first and second index if first < second
                {
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < 5; i++) //fill the topFive array with the first five elements
        {
            topFive[i] = list[i];
            System.out.println(topFive[i].name + ": " + topFive[i].sales);
        }
        return topFive;
    }
    
    
	
}
