package com.synclab.regenerate.service;

import com.synclab.regenerate.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiftService {

    @Autowired
    private ShiftRepository shiftRepository;
}
