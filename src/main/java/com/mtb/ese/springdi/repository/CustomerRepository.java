package com.mtb.ese.springdi.repository;

import com.mtb.ese.springdi.model.Customer;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
