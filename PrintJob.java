
package midtermoop;

public class PrintJob {
    private int jobID;
    private int printType;
    private int pages;
    private boolean paid;
    private boolean done;
    private boolean received;
    
    public PrintJob(int jobID, int printType, int pages){
        this.jobID = jobID;
        this.printType = printType;
        this.pages = pages;
        this.paid = false;
        this.done = false;
        this.received = false;
    }
    
    public double calculateCost(){
        if (printType == 1){
            return pages * 5.00;
        }
        else{
            return pages * 8.00;
        }
    }
    
    public void markPaid(){
        paid = true;
    }
    
    public void markDone(){
        done = true;
    }
    
    public void markReceived(){
        received = true;
    }
    
    public boolean isPaid(){
        return paid;
    }
    
    public boolean isDone(){
        return done;
    }
    
    public boolean isReceived(){
        return received;
    }
    
    public int getJobID(){
        return jobID;
    }
    
}
