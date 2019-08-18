package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.nbchrkgl_huowuyiwei;

/**
 * 内部出入库管理模块——货物移位数据访问层（接口类）
 *@author  孙军
 *2015年6月15日 下午2:25:19
 */
public interface nbchrkgl_huowuyiweiDAO {
  void add(nbchrkgl_huowuyiwei yw);
  void update(nbchrkgl_huowuyiwei yw);
  void deleteById(String hwyw_bill);
  List<nbchrkgl_huowuyiwei> findAll();
  List<nbchrkgl_huowuyiwei> findByLike(nbchrkgl_huowuyiwei yw);
  List<nbchrkgl_huowuyiwei> findBySplite(int currentPage, int pageSize);
  List<nbchrkgl_huowuyiwei> findBySpliteAndLike(nbchrkgl_huowuyiwei yw,int currentPage, int pageSize);
}
