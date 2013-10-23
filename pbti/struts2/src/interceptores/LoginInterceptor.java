package interceptores;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{
	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		String result = "";
			if(ActionContext.getContext().getSession().isEmpty()){
				result = "error";
			}else{
				result = invocation.invoke();
			}
		System.out.println(invocation.getAction().getClass() + ":"+result);
		return result;
	}

}