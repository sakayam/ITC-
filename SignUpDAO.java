package com.room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SignUpDAO extends CrudRepository <SignUpUser, String>{

}