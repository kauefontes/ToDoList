package dev.quewui.todolist.ui.todo_list

import dev.quewui.todolist.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodo(val todo: Todo) : TodoListEvent()
    data class OnDoneChange(val todo: Todo, val done: Boolean) : TodoListEvent()
    object OnUndoDeleteClick : TodoListEvent()
    data class OnTodoClick(val todo: Todo) : TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
