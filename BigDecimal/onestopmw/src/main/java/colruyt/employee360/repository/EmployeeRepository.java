package colruyt.employee360.repository;

import org.springframework.data.repository.CrudRepository;

import colruyt.employee360.entity.Employee;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
