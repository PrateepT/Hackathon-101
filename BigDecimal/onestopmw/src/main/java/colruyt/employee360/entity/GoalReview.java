package colruyt.employee360.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GoalReview {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer goal_id;

	private Integer emp_id;

	private Integer manager_id;

	private String emp_rvw_desc;

	private String mng_rvw_desc;

	private Integer emp_rating;

	private Integer mng_rating;

	public Integer getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(Integer goal_id) {
		this.goal_id = goal_id;
	}

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	public String getEmp_rvw_desc() {
		return emp_rvw_desc;
	}

	public void setEmp_rvw_desc(String emp_rvw_desc) {
		this.emp_rvw_desc = emp_rvw_desc;
	}

	public String getMng_rvw_desc() {
		return mng_rvw_desc;
	}

	public void setMng_rvw_desc(String mng_rvw_desc) {
		this.mng_rvw_desc = mng_rvw_desc;
	}

	public Integer getEmp_rating() {
		return emp_rating;
	}

	public void setEmp_rating(Integer emp_rating) {
		this.emp_rating = emp_rating;
	}

	public Integer getMng_rating() {
		return mng_rating;
	}

	public void setMng_rating(Integer mng_rating) {
		this.mng_rating = mng_rating;
	}

}
