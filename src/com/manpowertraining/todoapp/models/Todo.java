package com.manpowertraining.todoapp.models;
<<<<<<< HEAD

/**
 * @authors
 */
public class Todo {
	long todoId;
	String title;
	String description;
	LocalDateTime completedOn;
	
	Todo() {
		this(1L, "Default Title", "Default Description");
	}
	
	Todo(long todoId, String title, String description, LocalDateTime completedOn) {
		this.todoId = todoId;
		this.title = title;
		this.description = description;
		this.completedOn = completedOn;
	}
	
	public long getId() {
		return todoId;
	}
	
	public void setId(long id) {
		todoId = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public LocalDateTime getCompletedOn() {
		return completedOn;
	}
	
	public void setCompletedOn(LocalDateTime completedOn) {
		this.completedOn = completedOn;
	}
	
	public String toString() {
		return "Todo { id : " + todoId + ". title : " + title + ". description : " + description + ". isCompleted : " + completedOn + "}";
	}
	
=======
/**
@authors
*/
public class Todo{
    String title;
    long todoId;
    String description;
    boolean isCompleted;	

    //TODO: implement
    /**
        Constructor.
        getters and setters
     */
>>>>>>> fe66028524f65be9282a60339e7b09d815ecf9a0
}