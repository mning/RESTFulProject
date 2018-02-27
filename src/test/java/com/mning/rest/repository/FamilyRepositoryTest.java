package com.mning.rest.repository;

import com.mning.rest.MningRestApplication;
import com.mning.rest.domain.Family;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mning on 8/14/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MningRestApplication.class)
public class FamilyRepositoryTest {
    @Autowired
    FamilyRepository repository;

    @Test
    public void findsAllNotes() {
        List<Family> families = this.repository.findAll();
        assertEquals(0, families.size());
    }
}
