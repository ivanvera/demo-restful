package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Teacher;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface TeacherDao {

    Long saveTeacher(Teacher teacher);
    List<Teacher> findAllTeacher();
}
