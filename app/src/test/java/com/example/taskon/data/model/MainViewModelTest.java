package com.example.taskon.data.model;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.Observer;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.BaseRepositoryImplementation;
import com.example.taskon.data.service.RetrofitService;
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

    private BaseViewModel viewModel;

    @Before
    public void setUp() {

        MockitoAnnotations.openMocks(this);
        viewModel = new BaseViewModel(new BaseRepositoryImplementation(new RetrofitService()));

    }

    @Test
    public void testGetTaskById_IsIdEqualInputId() {

        viewModel.getTaskById(0);
        viewModel.getTask.observeForever(task -> {
            Assert.assertEquals(0, task.getTaskId());
            System.out.println(task.getTask());
        });
    }
}
