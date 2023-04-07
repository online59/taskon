package com.example.taskon.data.model;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.Observer;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.RetrofitRepoImp;
import com.example.taskon.data.client.RetrofitService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;

public class MainViewModelTest {

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();
    @Mock
    Observer<Task> taskObserver;

    private MyViewModel<Task> viewModel;

    @Before
    public void setUp() {

        MockitoAnnotations.openMocks(this);
        viewModel = new TaskViewModel(new RetrofitRepoImp(new RetrofitService()));
        viewModel.setUrl("https://jsonplaceholder.typicode.com/");
    }

    @Test
    public void getTaskById_IsIdEqualInputId() {

        viewModel.getById(0).observeForever(task -> {
            System.out.println(task.getTask());
            Assert.assertEquals(0, task.getTaskId());
        });
    }

    @Test
    public void getAllTasks_IsNotNull() {

        viewModel.getAll().observeForever(tasks -> {
            System.out.println(tasks.get(0).getTask());
            Assert.assertNotNull(tasks);
        });
    }
}
