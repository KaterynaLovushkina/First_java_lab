package ua.lviv.iot.lab.dataaccess;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.lab.rest.models.MemberForTemporaryJob;

@Repository// створюється обєкт типу репозіторі
public interface MemberRepository extends
        JpaRepository<MemberForTemporaryJob, Integer> {

}