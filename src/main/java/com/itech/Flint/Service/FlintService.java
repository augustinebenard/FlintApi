package com.itech.Flint.Service;

import com.itech.Flint.Repository.FlintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class FlintService {

    @Autowired
    private FlintRepository flintRepo;


    public FlintRepository getFlintRepo() {
        return flintRepo;
    }

    public void setFlintRepo(FlintRepository flintRepo) {
        this.flintRepo = flintRepo;
    }
}
