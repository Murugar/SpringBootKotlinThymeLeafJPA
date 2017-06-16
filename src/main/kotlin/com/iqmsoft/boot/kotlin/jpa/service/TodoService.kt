package com.iqmsoft.boot.kotlin.jpa.service

import com.iqmsoft.boot.kotlin.jpa.entity.Todo
import com.iqmsoft.boot.kotlin.jpa.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService @Autowired constructor(val todoRepository: TodoRepository) {

    fun create(todo: Todo): Todo {
        return todoRepository.save(todo)
    }

    fun findOne(id: Long): Todo {
        return todoRepository.findOne(id)
    }

    fun findAll(): Iterable<Todo> {
        return todoRepository.findAll()
    }

    fun delete(todo: Todo) {
        todoRepository.delete(todo)
    }
}
