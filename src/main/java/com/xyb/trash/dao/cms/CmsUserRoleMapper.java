/*
 * 版权所有 2018 ，xieyunbo.com
 */

/*
 * 版权所有 2018 ，xieyunbo.com
 */

package com.xyb.trash.dao.cms;


import com.xyb.trash.annotation.OaDao;
import com.xyb.trash.pojo.cms.CmsUserRole;
@OaDao
public interface CmsUserRoleMapper {
    int insert(CmsUserRole record);

    int insertSelective(CmsUserRole record);
}