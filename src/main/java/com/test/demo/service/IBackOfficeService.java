package com.test.demo.service;

import com.test.demo.input.InputDTO;
import com.test.demo.output.Wrapper;

public interface IBackOfficeService {
    Wrapper getFarmanet(InputDTO inputDto) throws Exception;
}