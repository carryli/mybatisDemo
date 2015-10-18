package org.carryli.work.dao.imp;

import java.util.List;

import org.carryli.work.entity.Member;

public interface MemberDaoImp {
	public List<Member> selectMember();
	public int insertMember(Member member);
	public int updateMember(Member member);
	public int deleteMemberById(int memberId);
}
