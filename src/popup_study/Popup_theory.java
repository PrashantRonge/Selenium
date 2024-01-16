package popup_study;

public class Popup_theory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Popups: 
//			1.Popups are small or separate window which will be displayed 
//			  when we perform action on any components present in a webpage.
//			2.These popus can be handled by selenium directly, but sometimes
//			  we may need to use 3rd (Auto IT) party tools to handle these popups.
//
//			Types of popups:
//				*1. Hidden-Division Popup
//				*2. Alert popup
//				*3. Child browser Popup
//				 4. Authentication Popup
//				 5. File Upload Popup
//				 6. File Download Popup
//
//			1.If we are able to inspect element present in a popup then we can 
//			  use selenium directly to handle that popup.
//			2.If we are unable to inspect element present in a popup then we 
//			  need to use 3rd party tool to handle that popup.
//
//			##1. Hidden-Division Popup:
//			   a>. These popups are colorful.
//			   b>. We can inspect the elements present in pop up.
//			   c>. As we can inspect element present in popup then using selenium 
//			      we can handle it & no need to switch.
//			     
//			     
//			##2. Alert Popup:
//			   a>. We cannot inspect the elements present in pop up, does not have 
//			       any colors
//			   b>. These popups will contain ok button or cancel button & Text.
//			   c>. Sometimes this type of popup also contains”?” or “!” symbol.
//
//			-----------Procedure to handle Alert popup-------------------
//			1. To handle alert popup we need to switch selenium focus from
//			    main page to alert popup by using syntax
//			    
//			         Alert alt = driver.switchTo().alert();
//	        2. Alert is an interface which contains abstract methods like:
//			  
//	        	A>. accept(): use to click on ok button.
//			    B>. dismiss(): use to click on cancel button.
//			    C>. getText(): use to get text present in an alert popup.
//
//		        To click on OK button🡪 			alt.accept();
//
//		        To click on Cancel button🡪			alt.dismiss();
//
//		        To get the text present in a webpage🡪	String text = alt.getText();
//
//
//		    ##3. Child browser Popup/window popup
//		        1.We can inspect elements present in popup.
//		        2.This popup will contain address field(url),maximize,minimize
//		          and close options.
//		          
//		    -----------Procedure to handle Alert popup-------------------      
//		     1.   To handle Child browser popup we need to switch selenium focuS
//		          from main page to Child browser popup by using syntax
//		          driver.switchTo().window("String windowId")
//
//		     2.   To get ID of main page  we need to use syntax		
//		          String IdOfMainPage=driver.getWindowHandle(); //return type of getWindowHandle method is String
//		          To get address of main page as well child browser we need to use synatx
//		          		set<String> IdOfAllpages=driver.getWindowHandles();
//		          		//return type of getWindowHandles method is set<String>
//		          		
//		     3.   To get address of child browser we need to use synatx
//		          		Set<String> ids = driver.getWindowHandles();		
//		          		ArrayList al=new ArrayList(ids);
//		          		System.out.println(al.get(0));  // address of main page
//		          		System.out.println(al.get(1));	// address of child1 browse
//   
   


	}

}
