package com.cognizant.ormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Attempt;
@Repository
public interface AttemptRepository extends JpaRepository<Attempt, Integer> {
	@Query("select a from Attempt a left join a.user u where u.id=:userId and a.id=:attemptId")
	public Attempt getAttempt(@Param("userId") int userId, @Param("attemptId") int attemptId);
	@Query("select a from User u left join u.attempts a left join fetch a.attemptQuestion aq left join fetch aq.question q left join fetch aq.attemptOption ao left join fetch q.options o where u.id=:userId and a.id=:attemptId")
	public Attempt getAttemptDetail(@Param("userId") int userId, @Param("attemptId") int attemptId);
}
