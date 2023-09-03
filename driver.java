public class driver
{
    public static void main(String[] args)
    {
        Salesman[] totalSales;
    
        Salesman Johnny = new Salesman("Johnny", 43500);
        Salesman Abby = new Salesman("Abby", 50000);
        Salesman Miller = new Salesman("Miller", 41900);
        Salesman Jacob = new Salesman("Jacob", 19500);
        Salesman Tim = new Salesman("Tim", 90000);
        Salesman Luke = new Salesman("Luke", 51000);
        Salesman Litty = new Salesman("Litty", 8000);
        Salesman Scooby = new Salesman("Scooby", 44000);
        
        totalSales = new Salesman[] {Johnny, Abby, Miller, Jacob, Tim, Luke, Litty, Scooby};
        //System.out.println(totalSales.length);
        //topFiveSalesman(totalSales);
        
    }
    
    /*algorithm plan: sort the entire list first from smallest to largest
    and then drop the first elements until the new array is size 5 */
    
    public static Salesman[] topFiveSalesman(Salesman[] list)
    {
        Salesman[] topFive = new Salesman[5];
        
        int inOrderCount = 0;
        Salesman temp;
        
        System.out.println("I am right before the while loop");
        while(inOrderCount < list.length)
        {
            System.out.println("I have arrived in while loop.");

            for(int i = 0; i < list.length-1; i++)
            {
                System.out.println("I have arrived in the for loop");   
                if(list[i].sales > list[i+1].sales)
                {
                    inOrderCount++;
                    System.out.println(inOrderCount);
                }
                else if(list[i].sales < list[i+1].sales) //switches the first and second index if first < second
                {
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    //System.out.println(list[i].sales);
                }
            }
        }
        return topFive;
    }
    
    
	
}
