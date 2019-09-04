package com.worldpay.MultiThreading;

public class EmpThread extends Thread {
	int eno;
	int salary;
	String ename;

	public EmpThread(int eno, int salary, String ename) {
		this.eno = eno;
		this.salary = salary;
		this.ename = ename;
	}

	public void calculateSalary(int salary) {

		int hra = (int) (0.1 * salary);

		int da = (int) (0.2 * salary);
		int ca = (int) (0.1 * salary);
		System.out.println(currentThread().getName() + " " + "having enumber" + "  " + eno + "  " + "and having name :"
				+ ename + " " + " " + "has hra :" + hra + " da :" + da + " " + "ca:" + " " + ca + "....");
	}

	@Override
	public void run() {
		calculateSalary(salary);

	}

	public static void main(String args[]) {

		EmpThread empthread1 = new EmpThread(1001, 20000, "Ashi");
		empthread1.setName("Employee1");
		EmpThread empthread2 = new EmpThread(1002, 40000, "Aditya");
		empthread2.setName("Employee2");
		EmpThread empthread3 = new EmpThread(1003, 90000, "Aditi");
		empthread3.setName("Employee3");
		EmpThread empthread4 = new EmpThread(1004, 70000, "Gouri");
		empthread4.setName("Employee4");
		EmpThread empthread5 = new EmpThread(1005, 60000, "Harshita");
		empthread5.setName("Employee5");
		empthread1.start();
		empthread2.start();
		empthread3.start();
		empthread4.start();
		empthread5.start();

	}

}
