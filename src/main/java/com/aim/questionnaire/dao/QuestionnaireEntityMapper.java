package com.aim.questionnaire.dao;

import com.aim.questionnaire.dao.entity.QuestionnaireEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface QuestionnaireEntityMapper {

    List<Map<String, Object>> selectAllQuestionnaire();

    List<Map<String, Object>> selectQuestionnaireByProjectId(String projectId);

    Map<String, Object> selectQuestionnaireById(String questionnaireId);

    int deleteByProjectId(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int insert(QuestionnaireEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int insertSelective(QuestionnaireEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    QuestionnaireEntity selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(QuestionnaireEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(QuestionnaireEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(QuestionnaireEntity record);


    /**
     * 根据项目id查询此项目下的问卷个数
     *
     * @param projectId
     * @return
     */
    int selectQuestionCountByProjectId(String projectId);

    /**
     * 根据项目id查询此项目下的全部问卷
     *
     * @param id
     * @return
     */
    List<Map<String, Object>> queryQuestionListByProjectId(String id);

    /**
     * 根据问卷id查询问卷的概述信息
     *
     * @param id
     * @return
     */
    Map<String, Object> queryQuestionnaireInfoById(String id);

    /**
     * 查询历史问卷/模糊搜索
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> queryQuestionnaireList(HashMap<String, Object> map);

    /**
     * 修改历史问卷表状态
     *
     * @param map
     * @return
     */
    int modifyHistoryQuestionnaireStatus(HashMap<String, Object> map);

    /**
     * 添加问卷
     *
     * @param map
     * @return
     */
    int addQuestionnaire(HashMap<String, Object> map);

    /**
     * 根据问卷id查询问卷的详细信息
     *
     * @param map
     * @return
     */
    Map<String, String> queryQuestionnaireById(HashMap<String, Object> map);

    /**
     * 添加发送问卷方式
     *
     * @param map
     * @return
     */
    int addSendQuestionnaire(HashMap<String, Object> map);

    /**
     * 根据问卷id修改问卷
     *
     * @param questionnaireEntity
     * @return
     */
    int modifyQuestionnaireInfo(QuestionnaireEntity questionnaireEntity);

    /**
     * 根据项目id查询发布中问卷数量
     *
     * @param questionnaireEntity
     * @return
     */
    int queryReleaseQuestionnaireCount(QuestionnaireEntity questionnaireEntity);

    /**
     * 查询问卷的发送问卷的人数
     *
     * @param id
     * @return
     */
    int selectSendAnswerCount(String id);

    /**
     * 查询问卷模板
     *
     * @param dataId
     * @return
     */
    List<Map<String, Object>> queryQuestionnaireMould(String dataId);

    /**
     * 查询历史问卷
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> queryHistoryQuestionnaire(HashMap<String, Object> map);

    /**
     * 根据id修改问卷的全部信息
     *
     * @param map
     * @return
     */
    int modifyQuestionnaire(HashMap<String, Object> map);

    /**
     * 修改问卷状态
     *
     * @param map
     * @return
     */
    int modifyQuestionnaireStatus(HashMap<String, Object> map);

    /**
     * xxx问卷数量统计
     *
     * @param map
     * @return
     */
    Map<String, Object> queryQuestionnaireCount(HashMap<String, Object> map);

    /**
     * 根據問卷id查詢問卷的題目
     * @param questionId
     * @return
     */
    /**
     * add by fuqiang
     * 2018-12-16
     *
     * @param
     * @return start
     */
    Map<String, Object> queryeffectQuestionnaireCount(Map<String, Object> map);

    List<Map<String, Object>> queryeffectQuestionnaireschoolCount(Map<String, Object> map);

    List<Map<String, Object>> queryeffectQuestionnairequestionCount(Map<String, Object> map);

    /**
     * add by fuqiang
     * 2018-12-16
     *
     * @param
     * @return end
     */
    Map<String, Object> selectQuestionTitleById(String questionId);

    /**
     * 查找所有问卷的截止时间，过期问卷除外
     *
     * @return
     */
    List<Map<String, Object>> selectAllQueEndTime();

    /**
     * 查找所有问卷的开始时间
     *
     * @return
     */
    List<Map<String, Object>> selectAllQueStartTime();

    /**
     * 设置问卷过期
     */
    int modifyQuestionnaireStopStatus(Map<String, Object> map);

    /**
     * 查询问卷题目
     *
     * @param questionId
     * @return
     */
    String queryQuestionById(String questionId);

    /**
     * 查询历史问卷个数
     *
     * @param projectId
     * @return
     */
    int queryQuestHistoryCountByProjectId(String projectId);

    QuestionnaireEntity queryQuestContextEnd(String id);

    /**
     * 查询此人创建的问卷
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> queryAllQuestionnaireByCreated(Map<String, Object> map);

    /**
     * 根据问卷id查找问卷状态
     *
     * @param questionId
     * @return
     */
    int queryQuestionnaireStatus(String questionId);


    void updateSendStudentStatusInfo(List<Map<String, Object>> sendList);

    void updateSendGraduateStatusInfo(List<Map<String, Object>> sendList);

    void updateSendTeacherStatusInfo(List<Map<String, Object>> sendList);

    void updateSendCompanyStatusInfo(List<Map<String, Object>> sendList);

    List<Map<String, Object>> querySendStudentPeopleInfo(Map<String, Object> mapSendPeopleInfo);

    List<Map<String, Object>> querySendGraduatePeopleInfo(Map<String, Object> mapSendPeopleInfo);

    List<Map<String, Object>> querySendTeacherPeopleInfo(Map<String, Object> mapSendPeopleInfo);

    List<Map<String, Object>> querySendCompanyPeopleInfo(Map<String, Object> mapSendPeopleInfo);


    String queryQuestionnaireIsStopStatus(@Param("questionId") String questionId);

//    /**
//     * 查询所有状态为1的问卷
//     *
//     * @return
//     */
//    List<Map<String, Object>> queryAllQuestionnaire();

    /**
     * 批量插入问卷答题详情
     *
     * @param resultList
     * @param tableName
     * @return
     */
    int addQuestionRecordAnswerCount(@Param("list") List<Map<String, Object>> resultList, @Param("tableName") String tableName);

    /**
     * 批量插入学校答题情况明细
     *
     * @param resultList
     * @param tableName
     * @return
     */
    int addQuestionRecordAnswerSchool(@Param("list") List<Map<String, Object>> resultList, @Param("tableName") String tableName);

    /**
     * 数量统计
     *
     * @param map
     * @return
     */
    Map<String, Object> queryQuestionRecordCountSchool(HashMap<String, Object> map);

    /**
     * XXX问卷学校答题情况明细
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> queryRecordCountSchool(HashMap<String, Object> map);

    /**
     * XXX问卷答题详情
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> queryRecordCountAnswer(HashMap<String, Object> map);

    /**
     * 查询所有学校
     *
     * @param map
     * @return
     */
    List<String> selectRecordCountSchool(Map<String, Object> map);

    /**
     * 批量修改数据
     *
     * @param tableName
     * @param resultList
     * @return
     */
    int modifyQuestionRecordAnswerSchool(@Param("tableName") String tableName, @Param("list") List<Map<String, Object>> resultList);

    /**
     * 添加学校信息
     *
     * @param map
     * @return
     */
    int addRecordCountSchool(Map<String, Object> map);

    /**
     * 創建答案統計表格
     *
     * @param tableNameAnswer
     */
    void createRecordCountAnswer(@Param("tableName") String tableNameAnswer);

    /**
     * 創建學校統計表格
     *
     * @param tableNameSchool
     */
    void createRecordCountSchool(@Param("tableName") String tableNameSchool);

    /**
     * 刪除表格
     *
     * @param tableNameAnswer 答案統計表
     * @param tableNameSchool 學校統計表
     * @param questionId      問卷臨時手機號表
     * @return
     */
    int deleteTableByTableName(@Param("tableNameAnswer") String tableNameAnswer, @Param("tableNameSchool") String tableNameSchool, @Param("questionId") String questionId);

    /**
     * 修改答题人为0的统计
     *
     * @param tableName
     * @return
     */
    int modifyAnswerRateNull(@Param("tableNameAnswer") String tableName);

    void newQuestionnaireSendTable(@Param("tableName") String id);

    /**
     * 修改答题人答题是否有效状态
     *
     * @param map
     * @return
     */
    int modifyAnswerIsValid(Map<String, Object> map);

    /**
     * 修改问卷的创建人和修改人根据用户名
     *
     * @param map
     * @return
     */
    int modifyQuestionCreadBy(Map<String, Object> map);

    int modifyAnswerIsValidNot(Map<String, Object> map);

    int selectByName(String questionName);

    int selectByNameId(@Param("questionName") String questionName, @Param("id") String id);
}