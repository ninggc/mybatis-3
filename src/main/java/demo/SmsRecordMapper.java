/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package demo;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

@CacheNamespace
public interface SmsRecordMapper {
    @Select("select * from bd_sms_record where id = #{id}")
    BdSmsRecord selectById(Integer id);
    // int deleteByPrimaryKey(Integer id);
    //
    // int insert(demo.BdSmsRecord record);
    //
    // int insertSelective(demo.BdSmsRecord record);
    //
    // List<demo.BdSmsRecord> selectByExampleWithBLOBs(SMSRecordExample example);
    //
    // List<demo.BdSmsRecord> selectByExample(SMSRecordExample example);
    //
    BdSmsRecord selectByPrimaryKey(Integer id);
    //
    // int updateByPrimaryKeySelective(demo.BdSmsRecord record);
    //
    // int updateByPrimaryKeyWithBLOBs(demo.BdSmsRecord record);
    //
    // int updateByPrimaryKey(demo.BdSmsRecord record);
}
