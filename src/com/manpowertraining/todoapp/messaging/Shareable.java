package com.manpowertraining.todoapp.messaging;

import com.manpowertraining.todoapp.models.Todo;

/**
 * @authors
 */
interface Shareable {
	long findItemById(Todo itemId);
	
	void shareItem(Todo item);
}