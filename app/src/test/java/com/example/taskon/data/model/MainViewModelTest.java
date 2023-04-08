package com.example.taskon.data.model;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.Observer;
import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.WebRepositoryImplementation;
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

    private MainViewModel viewModel;

    @Before
    public void setUp() {

        MockitoAnnotations.openMocks(this);
        viewModel = TaskViewModel.getInstance(new WebRepositoryImplementation());
    }

    @Test
    public void getTaskById_IsIdEqualInputId() {

    }

    @Test
    public void getAllTasks_IsNotNull() {

    }
}
