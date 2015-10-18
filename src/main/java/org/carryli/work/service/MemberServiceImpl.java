package org.carryli.work.service;

import java.util.List;

import org.carryli.work.dao.imp.MemberDaoImp;
import org.carryli.work.entity.Member;
import org.carryli.work.service.impl.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Service
@EnableTransactionManagement
public class MemberServiceImpl implements MemberService {

	private MemberDaoImp memberDao;
	public MemberDaoImp getMemberDao() {
		return memberDao;
	}
	@Autowired
	public void setMemberDao(MemberDaoImp memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public void addMember(Member member) {
		memberDao.insertMember(member);
		
	}

	@Override
	public void deleteMember(Member member) {
		memberDao.deleteMemberById(member.getMemberid());
		
	}

	@Override
	public void updateMember(Member member) {
		memberDao.updateMember(member);
		
	}

	@Override
	public List<Member> findAll() {
		return memberDao.selectMember();
	}

}
