package org.subit.sms.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.subit.sms.data.Draft;

@Repository
public interface DraftRepo extends JpaRepository<Draft, Integer> {

}
