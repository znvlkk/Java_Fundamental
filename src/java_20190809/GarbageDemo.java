package java_20190809;

import java.io.IOException;
import java.util.ArrayList;

class A extends Thread {
	@Override
	public void run() {
		System.out.println("스레드");
	}
}

class B implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}

class Customer {
	String name;

	Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class CustomerDao {
	public Customer[] getCustomer() {
		Customer[] cs = new Customer[10];
		cs[0] = new Customer("일길동");
		cs[1] = new Customer("이길동");
		cs[2] = new Customer("삼길동");
		cs[3] = new Customer("사길동");
		cs[4] = new Customer("오길동");
		cs[5] = new Customer("육길동");
		cs[6] = new Customer("칠길동");
		cs[7] = new Customer("팔길동");
		cs[8] = new Customer("구길동");
		cs[9] = new Customer("십길동");
		return cs;
	}
	public ArrayList<Customer> getCustomers(){
	ArrayList<Customer> list = new ArrayList<Customer>();
	list.add(new Customer("홍길동1"));
	list.add(new Customer("홍길동2"));
	list.add(new Customer("홍길동3"));
	list.add(new Customer("홍길동4"));
	list.add(new Customer("홍길동5"));
	list.add(new Customer("홍길동6"));
	list.add(new Customer("홍길동7"));
	list.add(new Customer("홍길동8"));
	list.add(new Customer("홍길동9"));
	list.add(new Customer("홍길동10"));
	return list;
	}
}

public class GarbageDemo {
	public static void main(String[] args) throws IOException{
		//Dao (Date Access Object)
		CustomerDao cdao = new CustomerDao();
		Customer[] customers = cdao.getCustomer();
		for (Customer customer : customers) {
			System.out.println(customer.getName());
		}
		
		ArrayList<Customer> list = cdao.getCustomers(); 
		for (Customer customer : list) {
			System.out.println(customer.getName());
		}
		
	}
}
