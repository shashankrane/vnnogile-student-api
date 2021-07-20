package com.vnnogile.studentapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vnnogile.studentapi.module.StudentDetailsModule;

@Repository
public interface StudentDetailsRepository extends CrudRepository<StudentDetailsModule, Integer>{

}
