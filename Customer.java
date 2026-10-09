
package midtermoop;

public class Customer {
    private int customerID;
    private String customerName;
    private PrintJob[] printJobs;
    private int printJobCount = 0;
    
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }
    
    public void setPrintJob(int count){
        printJobs = new PrintJob[count];
    }
    
    public void addPrintJobs(PrintJob printJob){
        printJobs[printJobCount] = printJob;
        printJobCount++;
    }
    
    public PrintJob findPrintJob(int jobID){
        for(int i = 0; i < printJobCount; i++){
            if(printJobs[i].getJobID() == jobID){ 
                return printJobs[i];
            }
        }
        return null;
    }
    
    public int getCustomerID(){
        return customerID;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public double totalCost(){
        double total = 0;
        
        for(int i = 0; i < printJobCount; i++){
            total = total + printJobs[i].calculateCost();
        }
        return total;
    }
    
    public void displayInfo(){
        System.out.println("Customer " + customerID + " Information:");
        System.out.println("Name: " + customerName);
        System.out.println("ID: " + customerID);
        System.out.println("Total Cost: " +totalCost());
        
        System.out.println("Received by the customer: ");
        for(int i = 0; i < printJobCount; i++){
            System.out.print("Job " + printJobs[i].getJobID() + ": ");
            if(printJobs[i].isReceived() == true){
                System.out.println("File Received");
            }
            else{
                System.out.println("File Not Received");
            }
        }
        
        System.out.println("Done Printing: ");
        for(int i = 0; i < printJobCount; i++){
            System.out.print("Job " + printJobs[i].getJobID() + ": ");
            if(printJobs[i].isDone() == true){
                System.out.println("File already printed.");
            }
            else{
                System.out.println("File has not finished printing.");
            }
        }
        
        System.out.println("Payment Status: ");
        for(int i = 0; i < printJobCount; i++){
            System.out.print("Job " + printJobs[i].getJobID() + ": ");
            if(printJobs[i].isPaid() == true){
                System.out.println("Paid");
            }
            else{
                System.out.println("Unpaid");
            }
        }
        
        
        
    }

    
}
