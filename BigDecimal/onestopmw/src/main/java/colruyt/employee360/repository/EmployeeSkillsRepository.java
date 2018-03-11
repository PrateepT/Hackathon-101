package colruyt.employee360.repository;

import org.springframework.data.repository.CrudRepository;

import colruyt.employee360.entity.EmployeeSkills;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EmployeeSkillsRepository extends CrudRepository<EmployeeSkills, Long> {

}
