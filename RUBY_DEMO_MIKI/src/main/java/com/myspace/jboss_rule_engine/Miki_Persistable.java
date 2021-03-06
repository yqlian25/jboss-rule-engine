package com.myspace.jboss_rule_engine;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Miki_Persistable implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "MIKI_PERSISTABLE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "MIKI_PERSISTABLE_ID_GENERATOR", sequenceName = "MIKI_PERSISTABLE_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String project_name;

	private java.util.Date project_from_time;

	private java.util.Date project_end_time;

	public Miki_Persistable() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getProject_name() {
		return this.project_name;
	}

	public void setProject_name(java.lang.String project_name) {
		this.project_name = project_name;
	}

	public java.util.Date getProject_from_time() {
		return this.project_from_time;
	}

	public void setProject_from_time(java.util.Date project_from_time) {
		this.project_from_time = project_from_time;
	}

	public java.util.Date getProject_end_time() {
		return this.project_end_time;
	}

	public void setProject_end_time(java.util.Date project_end_time) {
		this.project_end_time = project_end_time;
	}

	public Miki_Persistable(java.lang.Long id, java.lang.String project_name,
			java.util.Date project_from_time, java.util.Date project_end_time) {
		this.id = id;
		this.project_name = project_name;
		this.project_from_time = project_from_time;
		this.project_end_time = project_end_time;
	}

}