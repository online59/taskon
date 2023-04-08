package com.example.taskon.data.repository;

import com.example.taskon.data.client.WebService;
import org.jetbrains.annotations.Nullable;

public class WebRepositoryImplementation extends MainRepository<WebService> {

    @Override
    public WebService getDatabase() {
        return new WebService();
    }
}
