package com.erjiangao.tutorselectiontool.Repository;

import com.erjiangao.tutorselectiontool.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepository<Course, Integer> {
}
