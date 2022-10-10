package com.manpowertraining.todoapp.messaging;
import com.manpowertraining.todoapp.models.Todo.java;
/**
@authors
*/
interface Shareable{
    long findItemById(Todo itemId);
    void shareItem(Todo item);
}