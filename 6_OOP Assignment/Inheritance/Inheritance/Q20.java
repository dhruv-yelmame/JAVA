/*Q5. Scenario:
App sends notifications through SMS or Email.
 Logic for sending notification must be switchable.
Requirement:
Create parent class Notification.
 Create SMSNotification and EmailNotification classes.
 Use parent reference to trigger notification message.
Input : Notification Type: SMS
Message: "Order Confirmed"
Output:SMS Sent: Order Confirmed
Explanation:
Your main code should use:
 Notification n = new SMSNotification();
 Switching to Email should not disturb core logic, giving loose coupling.
*/

class Notification
{
	String msg;
	void setNotify(String msg)
	{
		this.msg=msg;
	}
	
	String getResult()
	{
		return msg;
	}
}

class SMSNotification extends Notification
{
	String getResult()
	{
		return "SMS Sent: " + msg;
	}
	
}

class EmailNotification extends Notification
{
	String getResult()
	{
		return "Email Sent: " + msg;
	}
	
}

public class Q20
{
	public static void main(String x[])
	{
		Notification n = new SMSNotification();
		n.setNotify("Order Confirmed");
		System.out.println(n.getResult());
		
		n = new EmailNotification();
		n.setNotify("Order Confirmed");
		System.out.println(n.getResult());

	}
}