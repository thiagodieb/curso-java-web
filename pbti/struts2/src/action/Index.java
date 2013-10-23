package action;

import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport {
	 
	public String execute(){
		pause("aaa");
		return "success";
	}

	public String list(){
		return "result-list";
	}

}
