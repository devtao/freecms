package cn.freeteam.cms.dao;

import cn.freeteam.cms.model.Member;
import cn.freeteam.cms.model.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    Member selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_member
     *
     * @mbggenerated Fri Feb 01 19:56:20 CST 2013
     */
    int updateByPrimaryKey(Member record);
}