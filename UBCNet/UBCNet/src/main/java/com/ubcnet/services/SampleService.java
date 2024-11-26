package com.ubcnet.services;

import com.ubcnet.models.SampleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {
    public List<SampleModel> getSamples() {
        return List.of(new SampleModel("Sample 1"), new SampleModel("Sample 2"));
    }
}
