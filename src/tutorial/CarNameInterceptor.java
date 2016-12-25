package tutorial;
import java.lang.*;
import org.aopalliance.intercept.Invocation;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CarNameInterceptor extends AbstractInterceptor {
	
	//À¹½ØÆ÷Àà P86==============================
	
	@Override  
	public String intercept(ActionInvocation arg0) throws Exception {
		Object object = arg0.getAction();

		if (object == null || !(object instanceof CarAction)) {
			return Action.LOGIN;
		}
		
		CarAction action = (CarAction) object;
		String name = action.getName();
		
		if (name.contains("isis")) {
			name = name.replace("isis", "*");
			action.setName(name);
		}
		
		return arg0.invoke();		
	}
	/*ipublic String intercept(ActionInvocation arg0) throws Exception {
		Object object = arg0.getAction();

		if (object != null ){
			if(object instanceof CarAction){
				CarAction action = (CarAction) object;
				String name = action.getName();
				//System.out.println("");
				if (name.contains("isis")) {
					name = name.replaceAll("isis", "*");
					action.setName(name);
				}
				return arg0.invoke();	
			}else{
				return Action.LOGIN;
			}
			
		}
		return Action.LOGIN;
	}*/
}
