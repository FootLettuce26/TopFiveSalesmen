public class driver
{
    public static void main(String[] args)
    {
        Salesman[] totalSales;
    
        Salesman Johnny = new Salesman("Johnny", 43500); //instances of class
        Salesman Abby = new Salesman("Abby", 50000);
        Salesman Miller = new Salesman("Miller", 41900);
        Salesman Jacob = new Salesman("Jacob", 19500);
        Salesman Tim = new Salesman("Tim", 90000);
        Salesman Luke = new Salesman("Luke", 51000);
        Salesman Litty = new Salesman("Litty", 8000);
        Salesman Scooby = new Salesman("Scooby", 44000);
        
        totalSales = new Salesman[] {Johnny, Abby, Miller, Jacob, Tim, Luke, Litty, Scooby}; //fill the array
        topFiveSalesman(totalSales); //calling the function
        
    }
    
    /*algorithm plan: sort the entire list first from smallest to largest
    and then drop the first elements until the new array is size 5 */
    
    public static Salesman[] topFiveSalesman(Salesman[] list)
    {
        Salesman[] topFive = new Salesman[5]; //creating final array
        
        int inOrderCount = 0;
        Salesman temp;
        
        while(inOrderCount < list.length-1) //is 7 less than 7?
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
