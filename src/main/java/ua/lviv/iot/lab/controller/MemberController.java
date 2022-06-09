package ua.lviv.iot.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import ua.lviv.iot.lab.business.MemberService;
import ua.lviv.iot.lab.rest.models.MemberForTemporaryJob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/members")
@RestController
public class MemberController {

    private Map<Integer, MemberForTemporaryJob> members = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    private MemberService memberService;


    @GetMapping
    public List<MemberForTemporaryJob> getStudent() {

        return new LinkedList<>(members.values());
    }

    @GetMapping(path = "/{id}")
    public MemberForTemporaryJob getMember(
            final @PathVariable("id") Integer memberId) {
        return members.get(memberId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public MemberForTemporaryJob createMember(
            final @RequestBody MemberForTemporaryJob member) {

        System.out.println(memberService.createMember(member));

        member.setId(idCounter.incrementAndGet());
        members.put(member.getId(), member);
        return  member;
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<MemberForTemporaryJob> deleteStudent(
            @PathVariable("id") Integer memberId) {
        HttpStatus status = members.remove(memberId) == null
               ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
    @PutMapping(path = "/{id}")
    public ResponseEntity<MemberForTemporaryJob> updateStudent(
            final @PathVariable("id") Integer memberId,
            final @RequestBody MemberForTemporaryJob member) {
        HttpStatus status = members.put(memberId, member) == null
                ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        member.setId(memberId);
        return ResponseEntity.status(status).build();

    }


}
