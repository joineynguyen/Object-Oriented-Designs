package myPackage;

public class Manager extends Employee
{
  final String position = "Manager";

  public Manager(int employeeID, String fullName, CallManager callManager) 
  {
	  super(employeeID, fullName, callManager);
      this.level = 1;
  }
  
  //When the employee cannot handle the call, they can pass it up to their higher ranking colleagues by incrementing the level of the call and place it into call queue with new level
  public void escalateCall(Call call)
  {
	  if(currentCall != null)
	  {
		  this.currentCall = null;
		  this.isAvailable = true;
		  call.incrementLevel();
		  callManager.addToCallQueue(call);
		  System.out.println(position + " " + fullName + " has escalated the call to a higher representative");
	  }
  }

}
