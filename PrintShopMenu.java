
package midtermoop;

import java.util.Scanner;

public class PrintShopMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, members;
        System.out.print("Number of customers: ");
        members = scanner.nextInt();
        scanner.nextLine();
        Customer[] customers = new Customer[members];
        System.out.println();
        
        for(int i = 0; i < customers.length; i++){
            System.out.println("Customer " + (i + 1) + ":");
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Customer ID: ");
            int ID = scanner.nextInt();
            scanner.nextLine();
            
            customers[i] = new Customer(ID, name);
            System.out.println();
        }
        
        
        do{
            System.out.println("School Printing Service");
            System.out.println("1. Print Files");
            System.out.println("2. View Customers");
            System.out.println("3. Mark as Paid");
            System.out.println("4. Mark as Done");
            System.out.println("5. Mark as Received");
            System.out.println("6. View Balance");
            System.out.println("7. Exit");
            
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println();
            
            switch(choice){
                case 1:
                    System.out.print("Customer ID: ");
                    int customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    Customer foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        System.out.print("How many print jobs?: ");
                        int numPrintJobs = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();
                        foundCustomer.setPrintJob(numPrintJobs);
                        
                        for(int i = 0; i < numPrintJobs; i++){
                            System.out.print("Enter Job ID: ");
                            int jobID = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("1. Black and White");
                            System.out.println("2. Colored");
                            System.out.print("Choose one option: ");
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter number of pages: ");
                            int pages = scanner.nextInt();
                            scanner.nextLine();
                            
                            PrintJob printJobs = new PrintJob(jobID, option, pages);
                            foundCustomer.addPrintJobs(printJobs);
                            System.out.println("Job " + jobID + " added!");
                        }
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    
                    break;
                
                case 2:
                    System.out.print("Customer ID: ");
                    customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        foundCustomer.displayInfo();
                        System.out.println();
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    break;
                
                case 3:
                    System.out.print("Customer ID: ");
                    customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        System.out.print("Enter Job ID: ");
                        int jobID = scanner.nextInt();
                        scanner.nextLine();
                        
                        PrintJob foundJobID = foundCustomer.findPrintJob(jobID);
                        
                        if(foundJobID != null){
                            foundJobID.markPaid();
                            System.out.println("Job " + jobID + " paid.");    
                        } 
                        else{
                        System.out.println("Job ID not found!");
                        }
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    break;
                
                case 4:
                    System.out.print("Customer ID: ");
                    customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        System.out.print("Enter Job ID: ");
                        int jobID = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println();
                        PrintJob foundJobID = foundCustomer.findPrintJob(jobID);
                        
                        if(foundJobID != null){
                            foundJobID.markDone();
                            System.out.println("Job " + jobID + " done!");
                        }
                        else{
                        System.out.println("Job ID not found!");
                        }
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    break;
                    
                case 5:
                    System.out.print("Customer ID: ");
                    customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        System.out.print("Enter Job ID: ");
                        int jobID = scanner.nextInt();
                        scanner.nextLine();
                        
                        PrintJob foundJobID = foundCustomer.findPrintJob(jobID);
                        
                        if(foundJobID != null){
                            foundJobID.markReceived();
                            System.out.println("Job " + jobID + " has been given to the customer.");
                        }
                        else{
                            System.out.println("Job ID not found!");
                        }
                        
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    
                    break;
                
                case 6:
                    System.out.print("Customer ID: ");
                    customerID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    foundCustomer = null;
                    
                    for(int i = 0; i < customers.length; i++){
                        if(customers[i].getCustomerID() == customerID){
                            foundCustomer = customers[i];
                            break;
                        }
                    }
                    
                    if(foundCustomer != null){
                        System.out.println("Total Balance: " + foundCustomer.totalCost());
                    }
                    else{
                        System.out.println("Customer not found!");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
            }
            
        }while(choice != 7);
        
        
    }
    
}
