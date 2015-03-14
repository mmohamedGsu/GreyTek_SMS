package shha;


/**
 *
 * @author MooseMoose
 */
public class test {
     private static void testString(String name, String ... setOfStrings) {
            System.out.println(name);
            
            for(String s : setOfStrings) {
                System.out.print(s);
            }
                    
        }
     
     //need to cylce through the setOfStrings array and add it to one string
     //in the string builder
      private static void addDataToTable(String tableName, String... setOfStrings) {
        String sql;
        System.out.print("INSERT INTO " + tableName + " ");
        StringBuilder stringS = new StringBuilder();
        for(String s : setOfStrings) {
                stringS.append(s);
            }
        
        System.out.print(stringS);
                
      }
       
    public static void main(String[] args) {
        
        Database db = new Database("SMSDB");
        
        /* Create Database
        System.out.println("Creating SMSDB dataBase");
        Database db = new Database("SMSDB","create");
        System.out.println("Exiting creating SMSDB dataBase");
        */
        
        /*Create employees table
        System.out.println("Adding table");
        db.createTable("employees", "(userColumn varchar(20), passwordColumn varchar(20), accessLevel int)");
        System.out.println("Table added");
        */
        
        /*//Add entries into the Employees table
        String values =  "VALUES ('Admin1', 'Password1', 5)" +
                        ",('Admin2', 'Password2', 4)";
        System.out.println("Adding admin to table");
        db.addDataToTable("employees", values);
        System.out.println("Added admin to table");
        */
        
        //Print all the employees 
        db.printAll("employees");
        
        /*
        System.out.println("Removing all from table");
        db.removeAllFromTable("employees");
        System.out.println("All has been removed");
       */
    }
}
