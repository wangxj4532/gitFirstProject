package com.ydsn.tms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.ydsn.tms.po.jcxx_ReceiveFile;
import com.ydsn.tms.service.jcxx_ReceiveFileService;
import com.ydsn.tms.util.List2json;

@SuppressWarnings("serial")
public class jcxx_ReceiveFileAction extends ActionSupport {
	Logger logger = Logger.getLogger(jcxx_ReceiveFileAction.class);
	private jcxx_ReceiveFileService ser;
	private jcxx_ReceiveFile rec;
	private List<jcxx_ReceiveFile> recs;
	private String str;

	public String addRec() {
		ser.addRec(rec);
		;
		return Action.SUCCESS;
	}

	public String deleteRec() {
		// 获取待删除对象的ID(被封装成了字符串数组str[])
		HttpServletRequest request = ServletActionContext.getRequest();
		String[] str = request.getParameterValues("str");
		// 遍历字符串数组删除待删除的对象。
		for (int i = 0; i < str.length; i++) {
			ser.deleteRecById(str[i]);
		}
		return Action.SUCCESS;
	}

	public String updateRec() {
		ser.updateRec(rec);
		return Action.SUCCESS;
	}
	public String showRec_name(){
		HttpServletResponse response = ServletActionContext.getResponse();
    	response.setCharacterEncoding("utf-8");
    	List<jcxx_ReceiveFile> reclist = ser.findAll();
    	String str=JSONArray.fromObject(reclist).toString();
    	try {
			PrintWriter out=response.getWriter();
			out.write(str);
		} catch (Exception e) {
           e.printStackTrace();
		}
		return null;
	}

	public String showRec() {
		// response中文转码
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		// 获取请求参数
		HttpServletRequest request = ServletActionContext.getRequest();
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("rows"));
		List<jcxx_ReceiveFile> reclist = ser.findAll();
		try {
			if (rec == null) {
				recs = ser.findAllBySplite(currentPage, pageSize);
				str = "{\"total\":" + reclist.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(recs, "rec") + "}";
			} else {
				recs = ser.findAllBySpliteAndLike(rec, currentPage, pageSize);
				str = "{\"total\":" + recs.size() + ",\"rows\":"
						+ List2json.obj2jsonArr(recs, "rec") + "}";
			}
			PrintWriter write = response.getWriter();
			write.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*----------------------------------------构造器和get/set方法-------------------------------------------------*/

	public jcxx_ReceiveFileAction() {
	}

	public jcxx_ReceiveFileAction(jcxx_ReceiveFileService ser) {
		this.ser = ser;
	}

	public jcxx_ReceiveFileService getSer() {
		return ser;
	}

	public void setSer(jcxx_ReceiveFileService ser) {
		this.ser = ser;
	}

	public jcxx_ReceiveFile getRec() {
		return rec;
	}

	public void setRec(jcxx_ReceiveFile rec) {
		this.rec = rec;
	}

	public List<jcxx_ReceiveFile> getRecs() {
		return recs;
	}

	public void setRecs(List<jcxx_ReceiveFile> recs) {
		this.recs = recs;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
