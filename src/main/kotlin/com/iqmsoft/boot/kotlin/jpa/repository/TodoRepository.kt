package com.iqmsoft.boot.kotlin.jpa.repository

import com.iqmsoft.boot.kotlin.jpa.entity.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : CrudRepository<Todo, Long>
