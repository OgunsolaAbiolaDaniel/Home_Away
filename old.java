public class old {
    public static String currentArea;


    enum  geographicArea  {
         String AreaName;
        long AreaBounds;
          List Services;
          List Students;
          geographicArea(String AreaName, long AreaBounds) {}

    };

    public class currentBounds{

    };

    public static int existence_Checker(String area_file){
        //f open to open the file with the name == area-file;
        //if it exists return 0; else return 1;
        return 0;
    }
    public static void requestArea(){
        System.out.println("Please enter your geographic area ");
        currentArea = input.nextLine();
        int exist = existence_Checker(currentArea);
        if(exist == 0){
            //f.open and read the longitude and latitudes and assign to current bounds
        } System.out.println("Area file not found ! please try again or set bounds....");
        System.out.println("Type \'R\' to try again ! or type \'bounds\' to set a new Geographic Area");
    }


    public static String caseConverter(String problematic_string){
    //a function that will be used even outside here in other classes as well
        return problematic_string.toLowerCase(Locale.ROOT);
    }
    //bounds_validity  checker
    public static boolean bounds_validityChecker(long topLat, long leftLong,long bottomLat ,long rightLong){
      boolean b ;
        if(topLat >bottomLat && rightLong >leftLong)b = true;
        b= false;
       return b;
    };



    //Task1 --
   /* interface bounds{
       long topLat
       long bottomLat
       long leftLong
       long rightLong;
    }*/
        //we get the arguments from the cmd line ...should we use scanner or the syscall??
    /*
    how do i use scanner to read all these values
    normally i want it in this format scanf(%d %d %d %d %s ,&topLat,&leftLong,&bottomlat,&rightlong)
    */
    public static String bounds(long topLat, long leftLong,long bottomLat ,long rightLong,String name){
      boolean bounds_isValid =  bounds_validityChecker(topLat,leftLong,bottomLat,rightLong);
      String area_name = name;
      if(!bounds_isValid){
          System.out.println("Invalid bounds");
      }//else save to text file-- are we to replace the current area file ?? with the inner content !(new area becomes currentarea)!. i.e set current_file to new bounds

        return name;
    }


    public static void save(){
        //save current area into text-file with the name of bounds;
        //f.open
    }
    public static long inputs(){
        System.out.println("Please define your bounds :");
        long topLat = input.nextLong();
        long leftLong = input.nextLong();
        long bottomLat = input.nextLong();
        long rightLong = input.nextLong();
        String name = input.next();
        return (topLat leftLong,bottomLat,rightLong);
    }



//first situation on loading our app
    /* what happens when start the app newly
    --no current Area
    --so we then ask user to type in their geographic area
    --we look for the file with the same name as the inputed geographic area name
    CASE 1-- failed
    print ("error: invalid file not found");

    CASE 2 -- seen/success
    --if we see this we open and read the file
    --
    * */

    public static void main(String[] args){

        String command ;




        System.out.println("\n ---- Hello And Welcome to the Home Away from Home Application v25  .....  [Built with Java]!----");
        requestArea();
        command = input.nextLine();
        String returnCommand =  caseConverter(command);
       if (returnCommand == "r") {
        requestArea();
       } else if (command == "bounds") {
           System.out.println("Please define your bounds :");
           long topLat = input.nextLong();
           long leftLong = input.nextLong();
           long bottomLat = input.nextLong();
           long rightLong = input.nextLong();
           String name = input.next();
           bounds(topLat,leftLong,bottomLat,rightLong,name);
           //call the method bounds -- bounds ([])
       }


    }



}
