package dev.quewui.todolist.ui.todo_list

import dagger.hilt.android.lifecycle.HiltViewModel
import dev.quewui.todolist.data.TodoRepository
import dev.quewui.todolist.util.UiEvent
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val todoRepository: TodoRepository
) {
    val todos = todoRepository.getTodos()

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onEvent(event: TodoListEvent) {
        when(event) {
            is TodoListEvent.OnTodoClick -> {}
            is TodoListEvent.OnAddTodoClick -> {}
            is TodoListEvent.OnUndoDeleteClick -> {}
            is TodoListEvent.OnDeleteTodo -> {}
            is TodoListEvent.OnDoneChange -> {}

        }
    }
}