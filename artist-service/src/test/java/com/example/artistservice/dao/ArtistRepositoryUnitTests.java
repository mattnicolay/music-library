package com.example.artistservice.dao;

import static org.junit.Assert.*;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringRunner.class)
@DataJpaTest
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
    DbUnitTestExecutionListener.class})
@DatabaseSetup("classpath:test-dataset.xml")
public class ArtistRepositoryUnitTests {

}