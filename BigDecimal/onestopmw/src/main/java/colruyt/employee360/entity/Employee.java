package colruyt.employee360.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer EMP_ID;
    
    private String EMP_NAME;
    
    private Date DOJ;
    
    private String ACTIVE_JN;
    
    private String email;
    
    public Integer getEMP_ID() {
		return EMP_ID;
	}

	public void setEMP_ID(Integer eMP_ID) {
		EMP_ID = eMP_ID;
	}

	public String getEMP_NAME() {
		return EMP_NAME;
	}

	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	public String getACTIVE_JN() {
		return ACTIVE_JN;
	}

	public void setACTIVE_JN(String aCTIVE_JN) {
		ACTIVE_JN = aCTIVE_JN;
	}

	public Date getLAST_ACTIVE_DT() {
		return LAST_ACTIVE_DT;
	}

	public void setLAST_ACTIVE_DT(Date lAST_ACTIVE_DT) {
		LAST_ACTIVE_DT = lAST_ACTIVE_DT;
	}

	public Integer getDEPT_NO() {
		return DEPT_NO;
	}

	public void setDEPT_NO(Integer dEPT_NO) {
		DEPT_NO = dEPT_NO;
	}

	private Date LAST_ACTIVE_DT;
    
    private Integer DEPT_NO;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        
}

