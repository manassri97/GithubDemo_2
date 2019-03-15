package com.capgemini.employee_cucumber_1.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import com.capgemini.employee_cucumber_1.bean.Employee;



public class EmployeeRepoImpl implements EmployeeRepo {

	HashMap<Integer, Employee> hs = new HashMap<Integer, Employee>();
	
	public Employee save(Employee e) {
		hs.put(e.getId(), e);
		return e;
	}

	public List<Employee> findByName(String name) {
		List<Employee> list = new ArrayList<Employee>();
		hs.forEach((k,v) -> {
			if(name==v.getName())
				list.add(v);
		});
		return list;
	}

	public boolean findById(int id) {
		Iterator<Entry<Integer, Employee>> itr=hs.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer, Employee> pair=itr.next();
			if((Integer)pair.getKey()==id)
			{
				return true;
			}
		}
		return false;
	}
}
