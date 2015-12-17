package entities.person;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import entities.GPS.Gps;
import entities.Task.PopUp;
import entities.Task.TasksBank;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fullName;
	private BigInteger personId;
	private String mail;
	private int age;
	private Date DateTimeRegister;
	private TasksBank tasks;
	private Gps gps;
	private DefaultSettings defaultSettings;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public BigInteger getPersonId() {
		return personId;
	}
	public void setPersonId(BigInteger personId) {
		this.personId = personId;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateTimeRegister() {
		return DateTimeRegister;
	}
	public void setDateTimeRegister(Date dateTimeRegister) {
		DateTimeRegister = dateTimeRegister;
	}
	public TasksBank getTasks() {
		return tasks;
	}
	public void setTasks(TasksBank tasks) {
		this.tasks = tasks;
	}
	public Gps getGps() {
		return gps;
	}
	public void setGps(Gps gps) {
		this.gps = gps;
	}
	public DefaultSettings getDefaultSettings() {
		return defaultSettings;
	}
	public void setDefaultSettings(DefaultSettings defaultSettings) {
		this.defaultSettings = defaultSettings;
	}
	  
}
