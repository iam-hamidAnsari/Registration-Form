package com.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.form.Datamodel.Form;

@Repository
public interface FormRepository extends JpaRepository<Form, String>{

}
