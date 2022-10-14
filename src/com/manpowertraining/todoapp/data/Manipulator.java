package com.manpowertraining.todoapp.data;

import com.manpowertraining.todoapp.models.Todo;

/**
    @authors
 */

public interface Manipulator { 
    
    //add todo item.
    default void addTodo(Todo item) {
        todos.add(item);
    }
    void editTodoItem(Todo item);   //edit todo item.
    void deleteTodoItem(Todo item);  //delete todo item.
    Todo getTodoItemById(int id);   //get todo item.
    ArrayList<Todo> getTodoItems();     //get all todo items.

 }
