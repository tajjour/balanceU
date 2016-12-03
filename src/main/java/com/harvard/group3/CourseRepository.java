package com.harvard.group3;


import com.harvard.group3.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by tajjour on 2016-11-12.
 */
@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {


    default List<Course> findBySchool() {
        return findBySchool();
    }

    public List<Course> findBySchool(String name);
}
