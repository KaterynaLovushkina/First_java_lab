package ua.lviv.iot.lab.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lab.dataaccess.MemberRepository;
import ua.lviv.iot.lab.rest.models.MemberForTemporaryJob;


@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public MemberForTemporaryJob createMember(MemberForTemporaryJob member) {
        return memberRepository.save(member);
    }
}