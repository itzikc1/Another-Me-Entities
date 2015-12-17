package entities.Task;

import java.io.Serializable;
import java.sql.Date;

import entities.sms.SMS;

public class PopUp implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PopUpTemplates template;
	private String text;
	private boolean triggerSms;
	private Date DateTimeSend;
	private SMS sms;
	
	
	public PopUpTemplates getTemplate() {
		return template;
	}
	public void setTemplate(PopUpTemplates template) {
		this.template = template;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isTriggerSms() {
		return triggerSms;
	}
	public void setTriggerSms(boolean triggerSms) {
		this.triggerSms = triggerSms;
	}
	public Date getDateTimeSend() {
		return DateTimeSend;
	}
	public void setDateTimeSend(Date dateTimeSend) {
		DateTimeSend = dateTimeSend;
	}
	public SMS getSms() {
		return sms;
	}
	public void setSms(SMS sms) {
		this.sms = sms;
	}
}
