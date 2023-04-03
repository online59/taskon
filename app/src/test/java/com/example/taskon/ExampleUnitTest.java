package com.example.taskon;

import com.example.taskon.data.entity.Task;
import com.example.taskon.data.repository.TaskRepository;
import com.example.taskon.module.AppModule;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void requestWebService_isEqual() {
        AppModule module = new AppModule();

        TaskRepository repo = module.provideTaskRepository();

        Call<List<Task>> response = repo.getAllTasks();

        response.enqueue(new Callback<List<Task>>() {
            @Override
            public void onResponse(Call<List<Task>> call, Response<List<Task>> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<List<Task>> call, Throwable t) {

            }
        });
    }
}