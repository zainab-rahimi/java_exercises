package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloWorld {
	private String msg;
	
	public HelloWorld() {}
	
	public HelloWorld(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
