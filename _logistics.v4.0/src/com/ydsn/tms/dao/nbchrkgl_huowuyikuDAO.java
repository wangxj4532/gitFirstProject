package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.nbchrkgl_huowuyiku;

/**
 * 内部出入库管理模块--货物移库数据访问层接口
 *@author  孙军
 *2015年6月14日 下午8:41:34
 */
public interface nbchrkgl_huowuyikuDAO {
   void add(nbchrkgl_huowuyiku yk);
   void deleteById(String hwyk_bill);
   void update(nbchrkgl_huowuyiku yk);
   List<nbchrkgl_huowuyiku> findAll();
   List<nbchrkgl_huowuyiku> findByLike(nbchrkgl_huowuyiku yk);
   List<nbchrkgl_huowuyiku> findBySplite(int currentPage, int pageSize);
   List<nbchrkgl_huowuyiku> findBySpliteAndLike(nbchrkgl_huowuyiku yk,int currentPage, int pageSize);
}
