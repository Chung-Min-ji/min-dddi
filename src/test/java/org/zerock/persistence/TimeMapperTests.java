package org.zerock.persistence;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*.xml")

@Log4j
public class TimeMapperTests {

    @Setter(onMethod_=@Autowired)
    private TimeMapper timeMapper;

    @Test
    public void testGetTime(){

        log.info("testGetTime() invoked.");

        assertNotNull(timeMapper);

        log.info("timeMapper.getClass().getName() : " + timeMapper.getClass().getName()); //proxy객체 생성됨
        log.info("timeMapper.getTime() : " + timeMapper.getTime());
    } //testGetTime

    @Test
    public void testGetTime2(){

        log.info("testGetTime2() invoked.");
        log.info(timeMapper.getTime2());
    } //testGetTime2


} //end class