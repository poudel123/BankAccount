package com.capgemini.bank.service.impl;
import com.capgemini.bank.dao.CustomerDao;
import com.capgemini.bank.dao.impl.CustomerDaoImpl;
import com.capgemini.bank.model.Customer;
import com.capgemini.bank.service.customerService;


	public class CustomerServiceImpl implements customerService {
		
		private CustomerDao customerDao;
		
		public CustomerServiceImpl() {
			// TODO Auto-generated constructor stub
			customerDao = new CustomerDaoImpl();
		}

		@Override
		public Customer authenticate(Customer customer) {
			// TODO Auto-generated method stub
			return customerDao.authenticate(customer);
			
		}

		@Override
		public Customer updateProfile(Customer customer) {
			// TODO Auto-generated method stub
			return customerDao.updateProfile(customer);
		}

		@Override
		public boolean updatePassword(Customer customer, String oldPassword, String newPassword) {
			// TODO Auto-generated method stub
			return customerDao.updatePassword(customer, oldPassword, newPassword);
		}

	}
	


