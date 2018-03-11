package colruyt.employee360.repository;

import org.springframework.data.repository.CrudRepository;

import colruyt.employee360.entity.Goal;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface GoalRepository extends CrudRepository<Goal, Long> {

}
