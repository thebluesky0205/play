package com.example.lecture.repository;

import com.example.lecture.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public List<Member> findByUserId(String email);

    public List<Member> findByUserNo(Long userNo);

//    @Query("select m.userNo, m.pw, m.name, m.regDate from sh_member m")
//    public List<Object[]> listAllMember();
//
//    @Query("select m.userNo, m.pw, m.name, m.regDate from sh_member m where m.userNo = :user_no")
//    public Member listMember(@Param("user_no") Long userNo);
}