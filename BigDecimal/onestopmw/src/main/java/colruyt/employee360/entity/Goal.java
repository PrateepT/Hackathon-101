package colruyt.employee360.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Goal {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer goal_id;
	 
	 private String goal_desc;
	 
	 private String goad_type;

	public Integer getGoal_id() {
		return goal_id;
	}

	public void setGoal_id(Integer goal_id) {
		this.goal_id = goal_id;
	}

	public String getGoal_desc() {
		return goal_desc;
	}

	public void setGoal_desc(String goal_desc) {
		this.goal_desc = goal_desc;
	}

	public String getGoad_type() {
		return goad_type;
	}

	public void setGoad_type(String goad_type) {
		this.goad_type = goad_type;
	}
}
