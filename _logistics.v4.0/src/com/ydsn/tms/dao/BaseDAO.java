package com.ydsn.tms.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
/**
 * �������ݷ��ʲ�
 * 
 *@author  ���
 *2015��6��2�� ����10:13:29
 *@param <E>
 */


public class BaseDAO<E> extends HibernateDaoSupport{

	/**
	 * ���
	 * @param e
	 */
	protected void add(E e){
		this.getHibernateTemplate().save(e);
	}
	/**
	 * �޸�
	 * @param e
	 */
	protected void update(E e){
		this.getHibernateTemplate().update(e);
	}
	/**
	 * ������ɾ��
	 * @param e
	 */
	protected void delete(E e){
		this.getHibernateTemplate().delete(e);
	}
	/**
	 * ������IDɾ��
	 * @param OID
	 */
	protected void deleteById(Class<E> clz,int OID){
		E e=query(clz, OID);
		this.getHibernateTemplate().delete(e);;
	}
	/**
	 * ������IDɾ��
	 * @param OID
	 */
	protected void deleteById(Class<E> clz,String OID){
		E e=query(clz, OID);
		this.getHibernateTemplate().delete(e);;
	}
	/**
	 * ������ID��ѯ
	 * @param clz
	 * @param OID
	 * @return
	 */
	protected E query(Class<E> clz,int OID){
		@SuppressWarnings("unchecked")
		E e=(E) this.getHibernateTemplate().get(clz, OID);
		return e;
	}
	/**
	 * ������ID��ѯ
	 * @param clz
	 * @param OID
	 * @return
	 */
	protected E query(Class<E> clz,String OID){
		@SuppressWarnings("unchecked")
		E e=(E) this.getHibernateTemplate().get(clz, OID);
		return e;
	}
	/**
	 * ������������ѯ
	 * @param clz
	 * @param OID
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<Object[]> findByName(final String sql){
		  return this.getHibernateTemplate().executeFind(new HibernateCallback() {
				
				@Override
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					System.out.println(sql);
					Query query=session.createSQLQuery(sql);
			        return query.list();
				}
			});
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]> findByName2(final String sql){
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				System.out.println(sql);
				Query query=session.createSQLQuery(sql);
				return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]> findById(final String sql){
		  return this.getHibernateTemplate().executeFind(new HibernateCallback() {
				
				@Override
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					System.out.println(sql);
					Query query=session.createSQLQuery(sql);
			        return query.list();
				}
			});
	}
	/**
	 * hql����ѯȫ��
	 * @param hql
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<E> findAll(final String hql){
        return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery(hql);
		        return query.list();
			}
		});
		
	}
	/**
	 * ģ����ѯ
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<E> findByLike(final String hql,final String[] params){
       return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery(hql);
				for(int i=0;i<params.length;i++){
					query.setString(i, params[i]);
				}
		        return query.list();
			}
		});
		
	}
	/**
	 * ��ҳ��ѯȫ��
	 * @param hql
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<E> findBySplitePage(final String hql,final int currentPage,final int pageSize){
      return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery(hql);
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
		        return query.list();
			}
		});
		
	}
	/**
	 * ��ҳ��ģ����ѯ
	 * @param hql
	 * @param currentPage
	 * @param pageSize
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<E> findBySplitePageAndLike(final String hql,final int currentPage,final int pageSize,final String...params){
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery(hql);
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
				for(int i=0;i<params.length;i++){
					query.setString(i,"%"+params[i]+"%");
				}
				return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	protected List<E> login(final String hql,final String...params){
		
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=  session.createQuery(hql);
				for (int i = 0; i < params.length; i++) {
					query.setString(i, params[i]);
				}
				System.out.println("=====login BaseDAO execute======");
				return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]> nativeFindBySplitePageAndLike(final String sql,final int currentPage,final int pageSize,final String[]params){
		return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createSQLQuery(sql);
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
				for(int i=0;i<params.length;i++){
					query.setString(i,"%"+params[i]+"%");
					System.out.println(i+"====="+params[i]);
				}
				return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]>  nativeFindBySplitePage(final String sql,final int currentPage,final int pageSize){
      return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createSQLQuery(sql);
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
		        return query.list();
			}
		});
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]> nativeFindAll(final String sql){
        return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createSQLQuery(sql);
		        return query.list();
			}
		});
		
	}
	@SuppressWarnings("unchecked")
	protected List<Object[]> nativefindByLike(final String sql,final String...params){
       return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createSQLQuery(sql);
				for(int i=0;i<params.length;i++){
					query.setString(i, params[i]);
				}
		        return query.list();
			}
		});
		
	}
	/**
	 * �����ѯ
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected  Map<String, Object> findByGroup(final String hql,final String []params){
    return  (Map<String, Object>) this.getHibernateTemplate().execute(new HibernateCallback() {
		
		@Override
		//Ϊʲôorg.hibernate.Session���ܻ���Session(Session��������)
		public Object doInHibernate(Session session)
				throws HibernateException, SQLException {
			Query query=session.createQuery(hql);
			for(int i=0;i<params.length;i++){
				query.setString(i, params[i]);
			}
			return (Map<String, Object>) query.uniqueResult();
		}
	});
	}

	
	@SuppressWarnings("unchecked")
	protected List<E> VilPwd(final String sql,final String...params){
       return this.getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery(sql);
				for(int i=0;i<params.length;i++){
					query.setString(i, params[i]);
				}
		        return query.list();
			}
		});
		
	}
	protected void nativeSubmit(final String sql){
		System.out.println("==4==");
		Connection conn = null;
        Statement st= null;
        try {
          conn = getHibernateTemplate().getSessionFactory().openStatelessSession().connection();
          st = conn.createStatement();
          st.execute(sql);
        } catch (SQLException e) {
         e.printStackTrace();
        } catch (RuntimeException re) {
            throw re;
        }finally{
            try{
              if(st!=null)
               st.close();
              if(conn!=null)
               conn.close();
             }catch(SQLException e){
              System.out.println(e.toString());
             }

	}
        }
}
