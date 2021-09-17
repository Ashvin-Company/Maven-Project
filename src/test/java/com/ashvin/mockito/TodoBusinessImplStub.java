package com.ashvin.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ashvin.mockito.ToDoService;
import com.ashvin.mockito.TodoBusinessImpl;

public class TodoBusinessImplStub {

//	@Test
//	public void usingAStub() {
//		ToDoService todoService=new TodoServiceStub();
//		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoService);
//		List<String> todos=todoBusinessImpl.retrieveTodosRelatedToSpring("Ranga");
//		assertEquals(2,todos.size());
//		
//		
//	}
	@Test
	public void usingAmock() {
		ToDoService todoServicemock= mock(ToDoService.class);
		List<String> todos=Arrays.asList("Learn Spring MVC","Learn Spring","Learn Dance");
		when(todoServicemock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl=new TodoBusinessImpl(todoServicemock);
		List<String> filteredtodo=todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2,filteredtodo.size());
		
		
	}
}
