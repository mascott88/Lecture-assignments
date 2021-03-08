package employee;

public class Projects {
	
	private int projectId;

	private String projectName;
	private String clientName;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Projects( ) {

	}
	public Projects(int id ) {
		this.projectId = id;

	}
	public Projects(int projectId, String projectName, String clientName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
	}
	@Override //annotation
	public String toString() {
		return "Project [project id=" + projectId + ", project name=" + projectName + ", client name=" + clientName +"]";		
	}
}